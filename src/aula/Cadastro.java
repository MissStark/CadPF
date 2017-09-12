package aula;

import java.awt.Container;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

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
	JTextField txtCep = new JTextField();
	JLabel Cid = new JLabel("Cidade: ");
	JTextField txtCid = new JTextField();
	
	JLabel Est = new JLabel("Estado: ");
	JComboBox comboEst = new JComboBox();
	
	
	
	JLabel Tel = new JLabel("Telefone: ");
	JTextField txtTel = new JTextField();
	JLabel Cel = new JLabel("Celular: ");
	JTextField txtCel = new JTextField();
	JLabel RG = new JLabel("RG: ");
	JTextField txtRG = new JTextField();
	JLabel Cpf = new JLabel("CPF: ");
	JTextField txtCpf = new JTextField();
	

	

	
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
	
	paine.add(Tel);
	Tel.setBounds(10, 120, 55, 30);
	paine.add(txtTel);
	txtTel.setBounds(90, 120, 255, 30);
	
	paine.add(Cel);
	Cel.setBounds(350, 120, 55, 30);
	paine.add(txtCel);
	txtCel.setBounds(400, 120, 255, 30);
	
	paine.add(RG);
	RG.setBounds(10, 155, 55, 30);
	paine.add(txtRG);
	txtRG.setBounds(90, 155, 255, 30);
	
	paine.add(Cpf);
	Cpf.setBounds(350, 155, 55, 30);
	paine.add(txtCpf);
	txtCpf.setBounds(400, 155, 255, 30); 

	
	
	
	
	
	
	this.setLayout(null);
	this.setVisible(true);
	this.setSize(800, 300);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
}


public static void main(String args[]){
	Cadastro cad = new Cadastro();
}
}