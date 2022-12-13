package ZipCodeDB;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//JPanel is the "base class". GUIPanel is the "derived" class.

public class GUIPanel extends JPanel {
    private JTextField zipcode;
    private JButton Submit;
    private JTextArea output;
    private JButton MaxLat;
    private Database db; // the zipcode database

    public GUIPanel() {
        this.zipcode = new JTextField("zipcode", 7);
        this.add(this.zipcode);

        this.Submit = new JButton("Submit");
        this.add(this.Submit);
        this.Submit.addActionListener(new SubmitButtonListener());

        this.MaxLat = new JButton("Northernmost");
        this.add(this.MaxLat);
        this.MaxLat.addActionListener(new SubmitButtonListener2());

        this.output = new JTextArea(5, 20);
        this.add(this.output);

        this.db = new Database(); // load the zipcodes

    }
    class SubmitButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //function will get called when the user presses submit

            // get the zipcode out of the text field
            String code = zipcode.getText();

            ZipCode zc = db.search(code);
            WeatherObservation wob = zc.getWeatherData();
            output.setText(wob.toString());
            System.out.println(wob);
        }
    }
    class SubmitButtonListener2 implements ActionListener {

        public void actionPerformed(ActionEvent a){
            //String code = zipcode.getText();

            ZipCode zc = db.getNorthern();
            //WeatherObservation wob = zc.getWeatherData();
            //output.setText(wob.toString());
            //System.out.println(wob);
            output.setText(zc.toString());
            System.out.println(zc);
        }
    }
}

