import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.swing.*;

import javax.swing.JOptionPane;
public class BingoCardRunner {

	public static void main(String[] args) {
		String seed = JOptionPane.showInputDialog("Enter game Number");
		int intCast = Integer.parseInt(seed);
		String NumOfCards = JOptionPane.showInputDialog("How many cards do you want to create?");
		int NumOfCardsCast = Integer.parseInt(NumOfCards);
		String NumOfDays = JOptionPane.showInputDialog("How many days do you want to play?");
		int NumOfDaysCast = Integer.parseInt(NumOfDays);
		String NumOfWinners = JOptionPane.showInputDialog("How many winners do you want?");
		int NumOfWinnersCast = Integer.parseInt(NumOfWinners);
        BingoWindow idk = new BingoWindow("Bingo", intCast); 
        
			
		}

	}
