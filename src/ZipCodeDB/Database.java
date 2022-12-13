package ZipCodeDB;
/*
store data about all the zipcodes
 */

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Database implements LatLngInterface{

    private ArrayList<ZipCode> codes;

    public Database(){
        // allocate the array list
        this.codes = new ArrayList<>();
        this.load_zips();//it is implied and unambigious
    }
    //fill the zipcode arraylist with real data
    private void load_zips(){
        URL url = null; // null is the nothing value
        Scanner s = null;
        try {
            url = new URL("http://10.60.15.25/~ehar/cs219/zips.txt"); // create a URL object for the path
            s = new Scanner(url.openConnection().getInputStream());
        } catch (
                MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //read zipcode file line by line

        while (s.hasNextLine()){
            String line = s.nextLine();
            String [] parts = line.split(",");
            ZipCode z = new ZipCode(
                    parts[1].substring(1, parts[1].length()-1),
                    parts[2].substring(1, parts[2].length()-1),
                    parts[3].substring(1, parts[3].length()-1),
                    Double.parseDouble(parts[4]),
                    Double.parseDouble(parts[5]),
                    Integer.parseInt(parts[6])
                    );
            codes.add(z); //put z at the end of the array list
        }

        // sort by the zipcode
        Collections.sort(this.codes);

    }// load_zips

    // write a function to search for zipcode data via zipcode
    // return the reference to the object if found, null if not found
    public ZipCode findbyZip(String code) {
        for( int i = 0; i < this.codes.size(); i++){
            if (code.equals(this.codes.get(i).getCode()))
                return this.codes.get(i);
        }
        return null;
    }
    public ZipCode findbyZip1(String code) {
        for (ZipCode zipCode : this.codes) {
            if (code.equals(zipCode.getCode()))
                return zipCode;
        }
        return null;
    }
    private ZipCode bsearch(String target, int low, int high){
        if (low> high)
            return null;
        int mid = (low+high)/2;
        if (this.codes.get(mid).getCode().equals(target)){
            return this.codes.get(mid);
        }
        else if (this.codes.get(mid).getCode().compareTo(target)<0){
            return bsearch(target, mid+1, high);
        }
        else
            return bsearch(target, low, mid-1);
    }
    //provides a simpler interface to the bsearch function
    public ZipCode search(String code){
       // return bsearch(code, 0, codes.size()-1);
        int pos = Collections.binarySearch(this.codes,
                new ZipCode(code, "", "", 0, 0, 0));//only searching by the code so we dont care about the rest
        // returns an int that is the index in the array list
        if (pos != -1)
            return this.codes.get(pos);
        else
            return null;
    }
    public ZipCode getNorthern(){
        ZipCode max_lat = null;
        for (ZipCode code: this.codes){
            if (this.codes.get(0).getLat() < code.getLat()){
                max_lat = code;
            }
        }
        return max_lat;
    }

    // return the zipcode of the northernmost latitude
}
