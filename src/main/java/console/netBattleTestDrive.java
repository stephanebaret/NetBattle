package console;

import java.io.IOException;

import netBattleException.IllegalGridDimension;
import netBattleException.IllegalPositionMatch;
import netBattleException.IllegalValuePosition;
import netBattleException.NullPointerPosition;

public class netBattleTestDrive {

	public static void main(String[] args) {
		NetBattle n = new NetBattle();
		try {
			n.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
