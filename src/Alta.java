import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.Window;
import java.awt.Font;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ActionEvent;

public class Alta extends JFrame {

	private JPanel contentPane;
	static  JFrame estaVentana = null;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Alta frame = new Alta();
					estaVentana = frame;
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Alta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 439, 304);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAlta = new JLabel("ALTA");
		lblAlta.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlta.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAlta.setBounds(183, 11, 61, 14);
		contentPane.add(lblAlta);
		
		Label label = new Label("Por favor, complete los campos:");
		label.setBounds(10, 32, 177, 22);
		contentPane.add(label);
		
		Label label_1 = new Label("Titulo:");
		label_1.setBounds(111, 60, 46, 22);
		contentPane.add(label_1);
		
		Label label_2 = new Label("Autor:");
		label_2.setBounds(111, 88, 46, 22);
		contentPane.add(label_2);
		
		Label label_3 = new Label("Genero:");
		label_3.setBounds(111, 116, 46, 22);
		contentPane.add(label_3);
		
		Label label_4 = new Label("ISBN:");
		label_4.setBounds(111, 144, 46, 22);
		contentPane.add(label_4);
		
		Label label_5 = new Label("Paginas:");
		label_5.setBounds(111, 172, 46, 22);
		contentPane.add(label_5);
		
		Label label_6 = new Label("A\u00F1o:");
		label_6.setBounds(111, 200, 46, 22);
		contentPane.add(label_6);
		
		Label label_7 = new Label("Editorial:");
		label_7.setBounds(111, 228, 46, 22);
		contentPane.add(label_7);
		
		TextField textField = new TextField();
		textField.setBounds(163, 60, 152, 22);
		final JTextField textField1 = new HintTextField("asdasd");
		contentPane.add(textField, textField1);
		
		TextField textField_1 = new TextField();
		textField_1.setBounds(163, 88, 152, 22);
		contentPane.add(textField_1);
		
		TextField textField_2 = new TextField();
		textField_2.setBounds(163, 116, 152, 22);
		contentPane.add(textField_2);
		
		TextField textField_3 = new TextField();
		textField_3.setBounds(163, 144, 152, 22);
		contentPane.add(textField_3);
		
		TextField textField_4 = new TextField();
		textField_4.setBounds(163, 172, 152, 22);
		contentPane.add(textField_4);
		
		TextField textField_5 = new TextField();
		textField_5.setBounds(163, 200, 152, 22);
		contentPane.add(textField_5);
		
		TextField textField_6 = new TextField();
		textField_6.setBounds(163, 228, 152, 22);
		contentPane.add(textField_6);
		
		
	    final JTextField textFieldB = new HintTextField("Another hint here");
		
		Button button = new Button("Aceptar");
		button.setBounds(343, 209, 70, 22);
		contentPane.add(button);
		
		Button button_1 = new Button("Volver");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				GUI alta= new GUI();
				alta.getFrame().setVisible(true);	
				
			    dispose();
			}
		});
		button_1.setBounds(343, 237, 70, 22);
		contentPane.add(button_1);
	}
	class HintTextField extends JTextField implements FocusListener {

		  private final String hint;
		  private boolean showingHint;

		  public HintTextField(final String hint) {
		    super(hint);
		    this.hint = hint;
		    this.showingHint = true;
		    super.addFocusListener(this);
		  }

		  @Override
		  public void focusGained(FocusEvent e) {
		    if(this.getText().isEmpty()) {
		      super.setText("");
		      showingHint = false;
		    }
		  }
		  @Override
		  public void focusLost(FocusEvent e) {
		    if(this.getText().isEmpty()) {
		      super.setText(hint);
		      showingHint = true;
		    }
		  }

		  @Override
		  public String getText() {
		    return showingHint ? "" : super.getText();
		  }
		}
}