package view;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class Cadastro extends JFrame {
	JLabel Nome = new JLabel("Nome: ");
	JTextField txtNome = new JTextField();
	
	JLabel S = new JLabel("Sexo: ");
	JRadioButton[]sexo = new JRadioButton[2];
	ButtonGroup grupo = new ButtonGroup();{
	sexo[0] = new JRadioButton("Fem");
	sexo[1] = new JRadioButton("Masc");}
	
	
	JLabel End = new JLabel("Endereço: ");
	JTextField txtEnd = new JTextField();
	
	JLabel B = new JLabel("Bairro: ");
	JTextField txtB = new JTextField();
	
	JLabel Cep = new JLabel("CEP: ");
	JFormattedTextField txtCep = null;
	
	JLabel Cid = new JLabel("Cidade: ");
	JTextField txtCid = new JTextField();
	
	JLabel Est = new JLabel("Estado: ");
	JComboBox comboEst = new JComboBox();
	
	JLabel Tel = new JLabel("Telefone: ");
	JFormattedTextField txtTel = null;
	
	JLabel Cel = new JLabel("Celular: ");
	JFormattedTextField txtCel = null;
	
	JLabel RG = new JLabel("RG: ");
	JFormattedTextField txtRG = null;
	
	JLabel Cpf = new JLabel("CPF: ");
	JFormattedTextField txtCpf = null;
	
	JButton btnsvr = new JButton ("Salvar");
	JButton btnimp = new JButton ("Imprimir");
	
	MaskFormatter formatTel = null;
	MaskFormatter formatCel= null;
	MaskFormatter formatRG = null;
	MaskFormatter formatCpf = null;
	MaskFormatter formatCep = null;
	
	model.Cadastro cad= new model.Cadastro();

	public Cadastro(){
	super("Cadastro");
	
	Container paine = this.getContentPane();
	paine.add(Nome);
	Nome.setBounds(10, 15, 55, 30);
	paine.add(txtNome);
	txtNome.setBounds(90, 15, 355, 30);
	
	paine.add(S);
	S.setBounds(450, 15, 55, 30);
	grupo.add(sexo[0]);
	grupo.add(sexo[1]);
	paine.add(sexo[0]);
	paine.add(sexo[1]);
	sexo[0].setBounds(490, 15, 55, 30);
	sexo[1].setBounds(550, 15, 85, 30);
	
	
	paine.add(End);
	End.setBounds(10, 50, 70, 30);
	paine.add(txtEnd);
	txtEnd.setBounds(90, 50, 255, 30);
	
	paine.add(B);
	B.setBounds(350, 85, 55, 30);
	paine.add(txtB);
	txtB.setBounds(400, 85, 255, 30);
	
	
	try {
		formatCep = new MaskFormatter("#####-###");
		txtCep = new JFormattedTextField(formatCep);
	} catch (Exception ex){
		ex.printStackTrace();
	}
	paine.add(Cep);
	Cep.setBounds(480, 50, 55, 30);
	paine.add(txtCep);
	txtCep.setBounds(520, 50, 135, 30);
	
	paine.add(Cid);
	Cid.setBounds(10, 85, 55, 30);
	paine.add(txtCid);
	txtCid.setBounds(90, 85, 255, 30);
	
	paine.add(Est);
	Est.setBounds(350, 50, 55, 30);
	paine.add(comboEst);
	comboEst.addItem("AC");comboEst.addItem("AL");
	comboEst.addItem("AP");comboEst.addItem("AM");
	comboEst.addItem("BA");comboEst.addItem("CE");
	comboEst.addItem("DF");comboEst.addItem("ES");
	comboEst.addItem("GO");comboEst.addItem("MA");
	comboEst.addItem("MT");comboEst.addItem("MS");
	comboEst.addItem("MG");comboEst.addItem("PA");
	comboEst.addItem("PB");comboEst.addItem("PR");
	comboEst.addItem("PE");comboEst.addItem("PI");
	comboEst.addItem("RJ");comboEst.addItem("RN");
	comboEst.addItem("RS");comboEst.addItem("RO");
	comboEst.addItem("RR");comboEst.addItem("SC");
	comboEst.addItem("SP");comboEst.addItem("SE");
	comboEst.addItem("TO");
	
	comboEst.setBounds(400, 50, 55, 30);
	
	try {
		formatTel = new MaskFormatter("(##)####-####");
		txtTel = new JFormattedTextField(formatTel);
	} catch (Exception ex){
		ex.printStackTrace();
	}
	paine.add(Tel);
	Tel.setBounds(10, 120, 55, 30);
	paine.add(txtTel);
	txtTel.setBounds(90, 120, 255, 30);
	
	try {
		formatCel = new MaskFormatter("(##)#####-####");
		txtCel = new JFormattedTextField(formatCel);
	} catch (Exception ex){
		ex.printStackTrace();
	}
	paine.add(Cel);
	Cel.setBounds(350, 120, 55, 30);
	paine.add(txtCel);
	txtCel.setBounds(400, 120, 255, 30);
	
	try {
		formatRG = new MaskFormatter("##.###.###-A");
		txtRG = new JFormattedTextField(formatRG);
	} catch (Exception ex){
		ex.printStackTrace();
	}
	paine.add(RG);
	RG.setBounds(10, 155, 55, 30);
	paine.add(txtRG);
	txtRG.setBounds(90, 155, 255, 30);
	
	try {
		formatCpf = new MaskFormatter("###.###.###-##");
		txtCpf = new JFormattedTextField(formatCpf);
	} catch (Exception ex){
		ex.printStackTrace();
	}
	paine.add(Cpf);
	Cpf.setBounds(350, 155, 55, 30);
	paine.add(txtCpf);
	txtCpf.setBounds(400, 155, 255, 30); 

	paine.add(btnsvr);
	btnsvr.setBounds(230, 200, 130, 30);
	btnsvr.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			cad.setNome(txtNome.getText());
			cad.setEnd(txtEnd.getText());
			cad.setBairro(txtB.getText());
			cad.setCep(txtCep.getText());
			cad.setCid(txtCid.getText());
			cad.setTel(txtTel.getText());
			cad.setCel(txtCel.getText());
			cad.setRg(txtRG.getText());
			cad.setCpf(txtCpf.getText());
			
			
			
		}
		
	});
	
	paine.add(btnimp);
	btnimp.setBounds(380, 200, 130, 30);
	
	
	
	
	this.setLayout(null);
	this.setVisible(true);
	this.setSize(800, 300);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
}


public static void main(String args[]){
	Cadastro cad = new Cadastro();
}
}