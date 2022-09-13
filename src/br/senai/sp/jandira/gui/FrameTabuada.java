package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import org.w3c.dom.events.EventTarget;

import br.senai.sp.jandira.model.Tabuada;

public class FrameTabuada {

	public String titulo;
	public int altura;
	public int largura;
	public Color corDeFundoDaTela;
	public Font fonteDosLabels;
	public Color corDoTextoDoBotao;
	public Color corDoBotao;

	public void criarTela() {

		JFrame tela = new JFrame();
		tela.setTitle(titulo);
		tela.setSize(largura, altura);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);

		// Pegar o container para colocar componentes dentro dele
		Container painel = tela.getContentPane();
		painel.setBackground(corDeFundoDaTela);

		JLabel labelTitulo = new JLabel();
		labelTitulo.setText("Tabuada");
		labelTitulo.setBounds(10, 5, 100, 20);
		labelTitulo.setForeground(new Color(255, 255, 255));
		labelTitulo.setOpaque(true);
		labelTitulo.setBackground(Color.white);

		JLabel labelTitulo01 = new JLabel();
		labelTitulo01.setText("Tabuada 1.0");
		labelTitulo01.setBounds(60, 30, 300, 30);
		labelTitulo01.setFont(new Font("Courier new", Font.BOLD, 32));
		labelTitulo01.setForeground(new Color(255, 0, 0));

		JLabel labelSubTitulo = new JLabel();
		labelSubTitulo
				.setText(" Com a tabuada 1.0 os seus problemas acabaram. Calcule a tabuada que desejar em segundos!");
		labelSubTitulo.setBounds(30, 50, 500, 30);

		JTextField textFieldmultiplicando = new JTextField();
		textFieldmultiplicando.setBounds(270, 80, 180, 30);

		JLabel labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Multiplicando");
		labelMultiplicando.setBounds(150, 60, 300, 80);

		JTextField textFieldminimoMultiplicador = new JTextField();
		textFieldminimoMultiplicador.setBounds(270, 120, 180, 30);

		JLabel labelMinimomultiplicado = new JLabel();
		labelMinimomultiplicado.setText("Minimo multiplicado");
		labelMinimomultiplicado.setBounds(110, 120, 180, 30);

		JTextField textFieldmaximoMultiplicador = new JTextField();
		textFieldmaximoMultiplicador.setBounds(270, 160, 180, 30);

		JLabel labelMaximomultiplicado = new JLabel();
		labelMaximomultiplicado.setText("Maximo multiplicado");
		labelMaximomultiplicado.setBounds(110, 160, 180, 30);

		JButton buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		buttonCalcular.setBounds(30, 200, 230, 40);
		buttonCalcular.setBackground(Color.green);
		buttonCalcular.setForeground(new Color(100, 150, 100));

		JLabel labelResultado = new JLabel();
		labelResultado.setText("Resultado");
		labelResultado.setBounds(30, 250, 100, 30);

		JButton buttonLimpar = new JButton();
		buttonLimpar.setText("Limpar");
		buttonLimpar.setBounds(270, 200, 180, 40);
		buttonLimpar.setBackground(Color.YELLOW);
		buttonLimpar.setForeground(new Color(100, 100, 100));

		JList tabela = new JList();
		// tabela.setBounds(30, 250, 300, 100);

		JScrollPane scroll = new JScrollPane(tabela);
		scroll.setBounds(30, 250, 300, 100);

		// String[] carros = {"Gol", "Uno", "Fusca", "Palio", "Monza", "Jeep", "Celta",
		// "Brasilia", "Passat", "Variant"};

		// tabela.setListData(carros);

//		
//		tabela.setBounds(30, 250, 200, 300);

		painel.add(labelTitulo);
		painel.add(labelTitulo01);
		painel.add(labelSubTitulo);
		painel.add(textFieldmultiplicando);
		painel.add(textFieldminimoMultiplicador);
		painel.add(labelMinimomultiplicado);
		painel.add(textFieldmaximoMultiplicador);
		painel.add(labelMaximomultiplicado);
		painel.add(buttonCalcular);
		painel.add(buttonLimpar);
		painel.add(labelMultiplicando);
		painel.add(scroll);
		tela.setVisible(true);
		
		
		//adicionando addlister
		buttonCalcular.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Tabuada tabuada = new Tabuada();
				
				//caso o usuario não digite nada
				if (textFieldmultiplicando.getText().isEmpty() || (textFieldminimoMultiplicador.getText().isEmpty() || (textFieldmaximoMultiplicador.getText().isEmpty()))) {
					JOptionPane.showMessageDialog(null, "ERRO,preenha as lacunas vazias do multiplicando", "ERRO", 1);
				} else {
					tabuada.multiplicando = Integer.parseInt(textFieldmultiplicando.getText());
					tabuada.minimoMultiplicador = Integer.parseInt(textFieldminimoMultiplicador.getText());
					tabuada.maximoMultiplicador = Integer.parseInt(textFieldmaximoMultiplicador.getText());
					
					if (tabuada.maximoMultiplicador >= tabuada.minimoMultiplicador) {
						String[] resultado = tabuada.getTabuada();
						tabela.setListData(resultado);
					} else {
						JOptionPane.showMessageDialog(null, "O máximo deve ser aior do que o mínimo!!!");
					}
					
					
				}
	

			}

		});
		
		//botão para limpar  
		buttonLimpar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				textFieldmaximoMultiplicador.setText("");
				textFieldminimoMultiplicador.setText("");
				textFieldmultiplicando.setText("");

				String[] limpar = { "" };
				tabela.setListData(limpar);
				
				
			}
			
		});
		
	}
	
	
	




}
