package gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import services.interfaces.AccountManagementRemote;
import domain.User;

public class ILogin extends JFrame {
	private static Context context;
	private AccountManagementRemote proxy;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ILogin frame = new ILogin();
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
	public ILogin() {
		initProxy();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JButton btnNewButton = new JButton("login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					User user = proxy.login(textField.getText(),
							textField_1.getText());
				IPlayerHome playerHome=new IPlayerHome();
				playerHome.setVisible(true);
				playerHome.pack();
				
				} catch (Exception e2) {
					System.err.println("not found ..");
				}

			}
		});

		textField = new JTextField();
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);

		JLabel lblLogin = new JLabel("login");

		JLabel lblPassword = new JLabel("password");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane
				.setHorizontalGroup(gl_contentPane
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								Alignment.TRAILING,
								gl_contentPane.createSequentialGroup()
										.addContainerGap(210, Short.MAX_VALUE)
										.addComponent(btnNewButton).addGap(125))
						.addGroup(
								gl_contentPane
										.createSequentialGroup()
										.addGap(24)
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.TRAILING)
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addComponent(
																				lblLogin)
																		.addGap(33))
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addComponent(
																				lblPassword)
																		.addGap(18)))
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.LEADING)
														.addComponent(
																textField_1,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																textField,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addContainerGap(226, Short.MAX_VALUE)));
		gl_contentPane
				.setVerticalGroup(gl_contentPane
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								Alignment.TRAILING,
								gl_contentPane
										.createSequentialGroup()
										.addGap(72)
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(
																textField,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(lblLogin))
										.addGap(18)
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(
																textField_1,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																lblPassword))
										.addPreferredGap(
												ComponentPlacement.RELATED, 40,
												Short.MAX_VALUE)
										.addComponent(btnNewButton).addGap(59)));
		contentPane.setLayout(gl_contentPane);
	}

	public void initProxy() {
		try {
			context = new InitialContext();
			proxy = (AccountManagementRemote) context
					.lookup("ejb:/tn.edu.esprit.cs.playBox-ejb/AccountManagement!services.interfaces.AccountManagementRemote");
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
