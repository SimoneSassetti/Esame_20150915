package it.polito.tdp.anagrammi;

import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

import it.polito.tdp.anagrammi.model.Model;
import it.polito.tdp.anagrammi.model.Parola;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class AnagrammiController {
	Model model;
	public void setModel(Model model){
		this.model=model;
	}
    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private VBox txtSequenza;
    @FXML
    private TextField txtInput;
    @FXML
    private Button btnStatistica;
    @FXML
    private Button btnAnagrammi;
    @FXML
    private TextArea txtResult;
    
    @FXML
    void doStatistica(ActionEvent event) {
    	String stringa=txtInput.getText();
    	if(stringa=="" || stringa.length()<1 || !stringa.matches("[a-zA-Z]+")){
    		txtResult.appendText("Inserisci una stringa valida.\n");
    		return;
    	}
    	
    	int i=model.cercaParole(stringa.toLowerCase());
    	txtResult.appendText("Parola trovate: "+i+"\n");
    	Map<Character,Integer> mappa=model.getOccorrenze();
    	for(Character c: mappa.keySet()){
    		txtResult.appendText(c+" --> "+mappa.get(c)+"%\n");
    	}
    }
    
    @FXML
    void doAnagrammi(ActionEvent event) {
    	txtResult.clear();
    	String stringa=txtInput.getText();
    	if(stringa=="" || stringa.length()<1 || !stringa.matches("[a-zA-Z]+")){
    		txtResult.appendText("Inserisci una stringa valida.\n");
    		return;
    	}
    	
    	List<Parola> lista=model.cercaAnagrammi(stringa);
    	for(Parola p: lista){
    		txtResult.appendText(p.getNome()+"\n");
    	}
    }
    
    @FXML
    void initialize() {
        assert txtSequenza != null : "fx:id=\"txtSequenza\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert txtInput != null : "fx:id=\"txtInput\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert btnStatistica != null : "fx:id=\"btnStatistica\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert btnAnagrammi != null : "fx:id=\"btnAnagrammi\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Anagrammi.fxml'.";
    }
}
