	// private inner class for the squares on the board
	private class Square extends JPanel 
	{
		private String mark; // mark to be drawn in this square
		private int location; // location of square

		public Square( String squareMark, int squareLocation )
		{
			mark = squareMark;				// set mark for this square
		} // end Square constructor

		// return preferred size of Square
		public Dimension getPreferredSize() 
		{ 
			return new Dimension( 30, 30 ); // return preferred size
		} // end method getPreferredSize



		// draw Square
		public void paintComponent( Graphics g )
		{
			super.paintComponent(g);
			g.drawRect(0,  0, 29, 29); 	// draw square
			g.drawString(mark, 11, 20); // draw mark

		} // end method paintComponent
	} // end inner-class Square
} // end class TicTacToeClient
