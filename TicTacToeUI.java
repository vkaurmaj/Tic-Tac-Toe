import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TicTacToeUI extends JFrame 

{

	private JPanel contentPane;
	private TicTacToeBoard game_state = new TicTacToeBoard();
	
	// Runs the game
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToeUI frame = new TicTacToeUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// Constructor
	public TicTacToeUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 410, 375);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		frame();
	}
	
	// Creates UI with buttons
	public void frame() {

		JButton row1col1 = new JButton("");
		JButton row1col2 = new JButton("");
		JButton row1col3 = new JButton("");
		JButton row2col1 = new JButton("");
		JButton row2col2 = new JButton("");
		JButton row2col3 = new JButton("");
		JButton row3col1 = new JButton("");
		JButton row3col2 = new JButton("");
		JButton row3col3 = new JButton("");
		JButton reset = new JButton("Reset");

		row1col1.setPreferredSize(new Dimension(100, 90));
		row1col2.setPreferredSize(new Dimension(100, 90));
		row1col3.setPreferredSize(new Dimension(100, 90));
		row2col1.setPreferredSize(new Dimension(100, 90));
		row2col2.setPreferredSize(new Dimension(100, 90));
		row2col3.setPreferredSize(new Dimension(100, 90));
		row3col1.setPreferredSize(new Dimension(100, 90));
		row3col2.setPreferredSize(new Dimension(100, 90));
		row3col3.setPreferredSize(new Dimension(100, 90));
		reset.setPreferredSize(new Dimension(100, 20));
		
		// Handles actions per button click
		row1col1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				row1col1.setFont(new Font("Arial", Font.BOLD, 100));
				if (game_state.getTurn() == 0) {
					row1col1.setText("X");
					game_state.updateBoard(0, 0, 'X');				
				}
				
				else {
					row1col1.setText("O");
					game_state.updateBoard(0, 0, 'O');	
				}
				row1col1.setEnabled(false);
				if (update() == 1) {
					row1col1.setEnabled(false);
					row1col2.setEnabled(false);
					row1col3.setEnabled(false);
					row2col1.setEnabled(false);
					row2col2.setEnabled(false);
					row2col3.setEnabled(false);
					row3col1.setEnabled(false);
					row3col2.setEnabled(false);
					row3col3.setEnabled(false);
				}
			}
		});
		
		row1col2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				row1col2.setFont(new Font("Arial", Font.BOLD, 100));
				if (game_state.getTurn() == 0) {
					row1col2.setText("X");
					game_state.updateBoard(0, 1, 'X');				
				}
				
				else {
					row1col2.setText("O");
					game_state.updateBoard(0, 1, 'O');	
				}
				row1col2.setEnabled(false);
				if (update() == 1) {
					row1col1.setEnabled(false);
					row1col2.setEnabled(false);
					row1col3.setEnabled(false);
					row2col1.setEnabled(false);
					row2col2.setEnabled(false);
					row2col3.setEnabled(false);
					row3col1.setEnabled(false);
					row3col2.setEnabled(false);
					row3col3.setEnabled(false);
				}				
			}
		});
		
		row1col3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				row1col3.setFont(new Font("Arial", Font.BOLD, 100));
				if (game_state.getTurn() == 0) {
					row1col3.setText("X");
					game_state.updateBoard(0, 2, 'X');				
				}
				
				else {
					row1col3.setText("O");
					game_state.updateBoard(0, 2, 'O');	
				}
				row1col3.setEnabled(false);
				if (update() == 1) {
					row1col1.setEnabled(false);
					row1col2.setEnabled(false);
					row1col3.setEnabled(false);
					row2col1.setEnabled(false);
					row2col2.setEnabled(false);
					row2col3.setEnabled(false);
					row3col1.setEnabled(false);
					row3col2.setEnabled(false);
					row3col3.setEnabled(false);
				}			
			}
		});
		
		row2col1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				row2col1.setFont(new Font("Arial", Font.BOLD, 100));
				if (game_state.getTurn() == 0) {
					row2col1.setText("X");
					game_state.updateBoard(1, 0, 'X');				
				}
				
				else {
					row2col1.setText("O");
					game_state.updateBoard(1, 0, 'O');	
				}
				row2col1.setEnabled(false);
				if (update() == 1) {
					row1col1.setEnabled(false);
					row1col2.setEnabled(false);
					row1col3.setEnabled(false);
					row2col1.setEnabled(false);
					row2col2.setEnabled(false);
					row2col3.setEnabled(false);
					row3col1.setEnabled(false);
					row3col2.setEnabled(false);
					row3col3.setEnabled(false);
				}			
			}
		});
		
		row2col2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				row2col2.setFont(new Font("Arial", Font.BOLD, 100));
				if (game_state.getTurn() == 0) {
					row2col2.setText("X");
					game_state.updateBoard(1, 1, 'X');				
				}
				
				else {
					row2col2.setText("O");
					game_state.updateBoard(1, 1, 'O');	
				}
				row2col2.setEnabled(false);
				if (update() == 1) {
					row1col1.setEnabled(false);
					row1col2.setEnabled(false);
					row1col3.setEnabled(false);
					row2col1.setEnabled(false);
					row2col2.setEnabled(false);
					row2col3.setEnabled(false);
					row3col1.setEnabled(false);
					row3col2.setEnabled(false);
					row3col3.setEnabled(false);
				}
				
			}
		});
		
		row2col3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				row2col3.setFont(new Font("Arial", Font.BOLD, 100));
				if (game_state.getTurn() == 0) {
					row2col3.setText("X");
					game_state.updateBoard(1, 2, 'X');				
				}
				
				else {
					row2col3.setText("O");
					game_state.updateBoard(1, 2, 'O');	
				}
				row2col3.setEnabled(false);
				if (update() == 1) {
					row1col1.setEnabled(false);
					row1col2.setEnabled(false);
					row1col3.setEnabled(false);
					row2col1.setEnabled(false);
					row2col2.setEnabled(false);
					row2col3.setEnabled(false);
					row3col1.setEnabled(false);
					row3col2.setEnabled(false);
					row3col3.setEnabled(false);
				}
			}
		});
		
		row3col1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				row3col1.setFont(new Font("Arial", Font.BOLD, 100));
				if (game_state.getTurn() == 0) {
					row3col1.setText("X");
					game_state.updateBoard(2, 0, 'X');				
				}
				
				else {
					row3col1.setText("O");
					game_state.updateBoard(2, 0, 'O');	
				}
				row3col1.setEnabled(false);
				if (update() == 1) {
					row1col1.setEnabled(false);
					row1col2.setEnabled(false);
					row1col3.setEnabled(false);
					row2col1.setEnabled(false);
					row2col2.setEnabled(false);
					row2col3.setEnabled(false);
					row3col1.setEnabled(false);
					row3col2.setEnabled(false);
					row3col3.setEnabled(false);
				}
			}
		});
		
		row3col2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				row3col2.setFont(new Font("Arial", Font.BOLD, 100));
				if (game_state.getTurn() == 0) {
					row3col2.setText("X");
					game_state.updateBoard(2, 1, 'X');				
				}
				
				else {
					row3col2.setText("O");
					game_state.updateBoard(2, 1, 'O');	
				}
				
				row3col2.setEnabled(false);
				
				if (update() == 1) {
					row1col1.setEnabled(false);
					row1col2.setEnabled(false);
					row1col3.setEnabled(false);
					row2col1.setEnabled(false);
					row2col2.setEnabled(false);
					row2col3.setEnabled(false);
					row3col1.setEnabled(false);
					row3col2.setEnabled(false);
					row3col3.setEnabled(false);
				}
			}
		});
		
		row3col3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				row3col3.setFont(new Font("Arial", Font.BOLD, 100));
				if (game_state.getTurn() == 0) {
					row3col3.setText("X");
					game_state.updateBoard(2, 2, 'X');				
				}
				
				else {
					row3col3.setText("O");
					game_state.updateBoard(2, 2, 'O');	
				}
				
				row3col3.setEnabled(false);
				
				if (update() == 1) {
					row3col3.setEnabled(false);
					row1col1.setEnabled(false);
					row1col2.setEnabled(false);
					row1col3.setEnabled(false);
					row2col1.setEnabled(false);
					row2col2.setEnabled(false);
					row2col3.setEnabled(false);
					row3col1.setEnabled(false);
					row3col2.setEnabled(false);
					row3col3.setEnabled(false);
				}
			}
		});
		
		// Resets game
		reset.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				game_state = new TicTacToeBoard();
				row1col1.setText("");
				row1col2.setText("");
				row1col3.setText("");
				row2col1.setText("");
				row2col2.setText("");
				row2col3.setText("");
				row3col1.setText("");
				row3col2.setText("");
				row3col3.setText("");
				row3col3.setEnabled(true);
				row1col1.setEnabled(true);
				row1col2.setEnabled(true);
				row1col3.setEnabled(true);
				row2col1.setEnabled(true);
				row2col2.setEnabled(true);
				row2col3.setEnabled(true);
				row3col1.setEnabled(true);
				row3col2.setEnabled(true);
				row3col3.setEnabled(true);
				
			}
		});
		
		contentPane.add(row1col1);
		contentPane.add(row1col2);
		contentPane.add(row1col3);
		contentPane.add(row2col1);
		contentPane.add(row2col2);
		contentPane.add(row2col3);
		contentPane.add(row3col1);
		contentPane.add(row3col2);
		contentPane.add(row3col3);
		contentPane.add(reset);
	}
	
	// Updates gamestate
	public int update() {
		if (game_state.gameChecker() == -1) {
			JOptionPane.showMessageDialog(null, "Its a tie! No one wins!");
			game_state = new TicTacToeBoard();
		}
		
		else if (game_state.gameChecker() == 1) {
			if (game_state.getTurn() == 0) {
				JOptionPane.showMessageDialog(null, "X's win!");
			}
			else {
				JOptionPane.showMessageDialog(null, "O's win!");
			}
			
			game_state = new TicTacToeBoard();
			return 1;
			
		}
		
		game_state.turnChanger();

		return 0;
		
	}
	
};
