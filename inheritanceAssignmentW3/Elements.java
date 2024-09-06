package week3.inheritanceAssignmentW3;

public class Elements extends Button {
	
	public static void main(String[] args) {
		
		//Object creation for class Elements
		Elements e = new Elements();
		e.setText("Facebook");
		e.click();
		e.submit();
		
		//Object creation for class TextField
		TextField tf = new TextField();
		tf.setText("Amazon");
		tf.click();
		tf.getText();
		
		//Object creation for class CheckBoxButton
		CheckBoxButton cb = new CheckBoxButton();
		cb.setText("Flipckart");
		cb.click();
		cb.submit();
		cb.clickCheckButton();
		
		//Object creation for class RadioButton
		RadioButton rb = new RadioButton();
		rb.setText("Dmart");
		rb.click();
		rb.submit();
		rb.selectRadioButton();
	}

}
