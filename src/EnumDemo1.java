
public class EnumDemo1 {
	
		private enum Suit{CLUBS,DIAMONDS,HEARTS,SPADES}
	
	public static void main(String[] args) {
		System.out.println(Suit.CLUBS);
		System.out.println(Suit.DIAMONDS.name());		
		System.out.println(Suit.HEARTS.ordinal());
		System.out.println(Suit.SPADES.getDeclaringClass());
		System.out.println(Suit.CLUBS==Suit.CLUBS);
		System.out.println(Suit.CLUBS.equals(Suit.DIAMONDS));
		for (Suit suit:Suit.values())
		System.out.println(suit);
		
		
	}

}
