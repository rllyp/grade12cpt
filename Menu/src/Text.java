import java.awt.Color;

/**
 * The class for all text to be displayed on screen
 * 
 * @version January 14, 2021
 * @author Riley Power
 *
 */
public class Text extends ScreenElement {
	private int fontSize;
	private String text;
	private Color color;
	private String font;

	/**
	 * 
	 * @param x
	 * @param y
	 * @param fontSize
	 * @param text
	 * @param id
	 */
	public Text(int x, int y, int fontSize, String text, String id) {
		super(x, y, id);
		this.fontSize = fontSize;
		this.text = text;
		color = Color.BLACK;
		font = "Helvetica";
	}//Text

	/**
	 * @return Returns the font size of the text object
	 */
	public int getFontSize() {
		return fontSize;
	}//getFontSize

	/**
	 * @return Returns the text contained in the text object
	 */
	public String getText() {
		return text;
	}//getText

	/**
	 * @return Returns the desired color the text object
	 */
	public Color getColor() {
		return color;
	}//getColor

	/**
	 * @return Returns the font of the text object as a string
	 */
	public String getFont() {
		return font;
	}//getFont

	/**
	 * 
	 * @param text The text to insert in the text object
	 */
	public void setText(String text) {
		this.text = text;
	}//setText
}//Text
