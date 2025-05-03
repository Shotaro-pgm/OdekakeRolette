package odekake_rolette;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Roulette {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		String startCommand = null;
		String startStation = null;
		ArrayList<String> stationLineList = null;
		ArrayList<String[]> lineTargetStationCntList = new ArrayList();
		String useLine = null;
		String lineTarget = null;
		String lineStationCnt = "1";
		ArrayList<String> targetAndStationCountList;
		int RidingStationCnt;
		String todo = null;

		System.out.println(Const.MSG_APP_START);
		startCommand = scanner.nextLine();

		initialize(startCommand);

		//　スタートの駅を決める
		startStation = DecideStartStation();

		//　乗る路線を決める
		useLine = DecideLine(startStation, stationLineList, lineTargetStationCntList);

		//　方面を決める
		targetAndStationCountList = DecideTargetAndStationCnt(lineTarget, lineStationCnt, lineTargetStationCntList, useLine);
		lineTarget = targetAndStationCountList.get(0);
		lineStationCnt = targetAndStationCountList.get(1);

		//　乗車する駅数を決める
		RidingStationCnt = DecideRidingStationCount(lineStationCnt);

		//　やることを決める
		todo = DecideTodo();

		//　結果を出力する
		System.out.printf("%s駅から%sに乗って%s方面に%s駅分進んだところで%s", startStation, useLine, lineTarget, RidingStationCnt, todo);

	}

	public static void initialize(String startCommand) {
		if(!(startCommand.equals(Const.COMMAND_ROULETTE_START))) {
			System.out.println(Const.MSG_ERR_ELEAGAL_COMMAND);
			System.exit(1);
		}

	}

	public static String DecideStartStation() {
		String startStation = null;
		int tmpStartStationNum = 0;
		ArrayList<String> stationList = new ArrayList<String>(Arrays.asList(Const.START_STATION));

		do {
			tmpStartStationNum = (int) Math.floor(Math.random() * 10);
		} while(!(tmpStartStationNum < stationList.size()));

		startStation = stationList.get(tmpStartStationNum);

		return startStation;
	}

	public static String DecideLine(String startStation, ArrayList<String> stationLineList, ArrayList<String[]> lineTargetStationCntList) {
		String useLine = null;
		int tmpUseLineNum = 0;

		switch(startStation) {
		case "東京":
			stationLineList = SetTokyoStationLineList(lineTargetStationCntList);
			break;
		case "上野":
			stationLineList = SetUenoStationLineList(lineTargetStationCntList);
			break;
		case "池袋":
			stationLineList = SetIkebukuroStationLineList(lineTargetStationCntList);
			break;
		case "新宿":
			stationLineList = SetShinjukuStationLineList(lineTargetStationCntList);
			break;
		case "渋谷":
			stationLineList = SetShibuyaStationLineList(lineTargetStationCntList);
			break;
		case "品川":
			stationLineList = SetShinagawaStationLineList(lineTargetStationCntList);
			break;
		default:
			System.out.println("予期せぬエラーが発生しました。アプリケーションを終了します。");
			System.exit(1);
		}

		do {
			tmpUseLineNum = (int)Math.floor(Math.random() * 10);
		} while(tmpUseLineNum > stationLineList.size());

		useLine = stationLineList.get(tmpUseLineNum);

		return useLine;
	}

	public static ArrayList<String> DecideTargetAndStationCnt(String lineTarget, String lineStationCnt, ArrayList<String[]> lineTargetStationCntList, String useLine) {
		ArrayList<String> rstList = new ArrayList();
		ArrayList<String> tmpLineTargetStationCnt;
		int tmpLineDecNum = 0;
		ArrayList<String> LineTargetStationCnt = new ArrayList();
		ArrayList<ArrayList<String>> LineTargetStationCntList = new ArrayList();
		int tmpTargetDecNum;

		do {
			tmpLineTargetStationCnt = new ArrayList<String>(Arrays.asList(lineTargetStationCntList.get(tmpLineDecNum)));
			tmpLineDecNum++;
		} while(!tmpLineTargetStationCnt.contains(useLine));

		LineTargetStationCnt.add(tmpLineTargetStationCnt.get(1));
		LineTargetStationCnt.add(tmpLineTargetStationCnt.get(2));
		LineTargetStationCntList.add(LineTargetStationCnt);
		if(tmpLineTargetStationCnt.size() == 5) {
			LineTargetStationCnt.add(tmpLineTargetStationCnt.get(3));
			LineTargetStationCnt.add(tmpLineTargetStationCnt.get(4));
			LineTargetStationCntList.add(LineTargetStationCnt);
		}

		tmpTargetDecNum = (int)Math.floor(Math.random() * 10);
		if(LineTargetStationCntList.size() > 1) {
			if(tmpTargetDecNum > 4) {
				lineTarget = LineTargetStationCntList.get(1).get(0);
				lineStationCnt = LineTargetStationCntList.get(1).get(1);
			}
		} else {
			lineTarget = LineTargetStationCntList.get(0).get(0);
			lineStationCnt = LineTargetStationCntList.get(0).get(1);
		}

		rstList.add(lineTarget);
		rstList.add(lineStationCnt);

		return rstList;
	}

	public static int DecideRidingStationCount(String lineStationCnt) {
		int RidingStationCnt = (int)Math.floor(Math.random() * 1000);
		int tmpWari = 1;

		while(RidingStationCnt > Integer.parseInt(lineStationCnt)) {
			tmpWari++;
			RidingStationCnt = RidingStationCnt / tmpWari;
		}

		return RidingStationCnt;
	}

	public static ArrayList<String> SetTokyoStationLineList(ArrayList<String[]> lineTargetStationCntList) {
		ArrayList<String> stationLineList = new ArrayList<String>(Arrays.asList(Const.LINE_TOKYO));
		lineTargetStationCntList.add(Const.ST_TOKYO_TOKAIDO_HONSENN);
		lineTargetStationCntList.add(Const.ST_TOKYO_YAMANOTE);
		lineTargetStationCntList.add(Const.ST_TOKYO_KEIHIN_TOHOKU);
		lineTargetStationCntList.add(Const.ST_TOKYO_YOKOSUKA);
		lineTargetStationCntList.add(Const.ST_TOKYO_SOBU_HONSEN);
		lineTargetStationCntList.add(Const.ST_TOKYO_KEIO);
		lineTargetStationCntList.add(Const.ST_TOKYO_CHUO);
		lineTargetStationCntList.add(Const.ST_TOKYO_CHUO_HONSEN);
		lineTargetStationCntList.add(Const.ST_TOKYO_UENO_TOKYO);
		lineTargetStationCntList.add(Const.ST_TOKYO_TOHOKU_SHINKANSEN);
		lineTargetStationCntList.add(Const.ST_TOKYO_JOETSU_SHINKANSEN);
		lineTargetStationCntList.add(Const.ST_TOKYO_HOKURIKU_SHINKANSEN);
		lineTargetStationCntList.add(Const.ST_TOKYO_TOKAIDO_SHINKANSEN);
		lineTargetStationCntList.add(Const.ST_TOKYO_TOKYO_METRO_MARUNOUCHI);

		return stationLineList;
	}

	public static ArrayList<String> SetUenoStationLineList(ArrayList<String[]> lineTargetStationCntList) {
		ArrayList<String> stationLineList = new ArrayList<String>(Arrays.asList(Const.LINE_UENO));
		lineTargetStationCntList.add(Const.ST_UENO_YAMANOTE);
		lineTargetStationCntList.add(Const.ST_UENO_KEIHIN_TOHOKU);
		lineTargetStationCntList.add(Const.ST_UENO_TOHOKU_HONSEN);
		lineTargetStationCntList.add(Const.ST_UENO_JOBAN);
		lineTargetStationCntList.add(Const.ST_UENO_TAKASAKI);
		lineTargetStationCntList.add(Const.ST_UENO_UENO_TOKYO);
		lineTargetStationCntList.add(Const.ST_UENO_TOHOKU_SHINKANSEN);
		lineTargetStationCntList.add(Const.ST_UENO_JOETSU_SHINKANSEN);
		lineTargetStationCntList.add(Const.ST_UENO_HOKURIKU_SHINKANSEN);
		lineTargetStationCntList.add(Const.ST_UENO_TOKYO_METRO_GINZA);
		lineTargetStationCntList.add(Const.ST_UENO_TOKYO_METRO_HIBIYA);

		return stationLineList;
	}

	public static ArrayList<String> SetIkebukuroStationLineList(ArrayList<String[]> lineTargetStationCntList) {
		ArrayList<String> stationLineList = new ArrayList<String>(Arrays.asList(Const.LINE_IKEBUKURO));
		lineTargetStationCntList.add(Const.ST_IKEBUKURO_YAMANOTE);
		lineTargetStationCntList.add(Const.ST_IKEBUKURO_SAIKYO);
		lineTargetStationCntList.add(Const.ST_IKEBUKURO_SHONAN_SHINJUKU_TAKASAKI_ODAWARA);
		lineTargetStationCntList.add(Const.ST_IKEBUKURO_SHONAN_SHINJUKU_UTSUNOMIYA_ZUSHI);
		lineTargetStationCntList.add(Const.ST_IKEBUKURO_TOKYO_METRO_MARUNOUCHI);
		lineTargetStationCntList.add(Const.ST_IKEBUKURO_TOKYO_METRO_YURAKUCHO);
		lineTargetStationCntList.add(Const.ST_IKEBUKURO_TOKYO_METRO_FUKUTOSHIN);
		lineTargetStationCntList.add(Const.ST_IKEBUKURO_SEIBU_IKEBUKURO);
		lineTargetStationCntList.add(Const.ST_IKEBUKURO_TOBU_TOJO);

		return stationLineList;
	}

	public static ArrayList<String> SetShinjukuStationLineList(ArrayList<String[]> lineTargetStationCntList) {
		ArrayList<String> stationLineList = new ArrayList<String>(Arrays.asList(Const.LINE_SHINJUKU));
		lineTargetStationCntList.add(Const.ST_SHINJUKU_YAMANOTE);
		lineTargetStationCntList.add(Const.ST_SHINJUKU_SOBU);
		lineTargetStationCntList.add(Const.ST_SHINJUKU_SAIKYO);
		lineTargetStationCntList.add(Const.ST_SHINJUKU_CHUO);
		lineTargetStationCntList.add(Const.ST_SHINJUKU_CHUO_HONSEN);
		lineTargetStationCntList.add(Const.ST_SHINJUKU_SHONAN_SHINJUKU_TAKASAKI_ODAWARA);
		lineTargetStationCntList.add(Const.ST_SHINJUKU_SHONAN_SHINJUKU_UTSUNOMIYA_ZUSHI);
		lineTargetStationCntList.add(Const.ST_SHINJUKU_TOEI_SHINJUKU);
		lineTargetStationCntList.add(Const.ST_SHINJUKU_TOEI_OHEDO);
		lineTargetStationCntList.add(Const.ST_SHINJUKU_KEIO);
		lineTargetStationCntList.add(Const.ST_SHINJUKU_KEIO_SHINSEN);
		lineTargetStationCntList.add(Const.ST_SHINJUKU_ODAKYU_ODAWARA);

		return stationLineList;
	}

	public static ArrayList<String> SetShibuyaStationLineList(ArrayList<String[]> lineTargetStationCntList) {
		ArrayList<String> stationLineList = new ArrayList<String>(Arrays.asList(Const.LINE_SHIBUYA));
		lineTargetStationCntList.add(Const.ST_SHIBUYA_YAMANOTE);
		lineTargetStationCntList.add(Const.ST_SHIBUYA_SAIKYO);
		lineTargetStationCntList.add(Const.ST_SHIBUYA_SHONAN_SHINJUKU_TAKASAKI_ODAWARA);
		lineTargetStationCntList.add(Const.ST_SHIBUYA_SHONAN_SHINJUKU_UTSUNOMIYA_ZUSHI);
		lineTargetStationCntList.add(Const.ST_SHIBJYA_TOKYO_METRO_GINA);
		lineTargetStationCntList.add(Const.ST_SHIBJYA_TOKYO_METRO_HANZOMON);
		lineTargetStationCntList.add(Const.ST_SHIBJYA_TOKYO_METRO_FUKUTOSHIN);
		lineTargetStationCntList.add(Const.ST_SHIBUYA_KEIO_INOKASHIRA);
		lineTargetStationCntList.add(Const.ST_SHIBUYA_TOKYU_TOYOKO);
		lineTargetStationCntList.add(Const.ST_SHIBUYA_TOKYU_DENENTOSHI);

		return stationLineList;
	}

	public static ArrayList<String> SetShinagawaStationLineList(ArrayList<String[]> lineTargetStationCntList) {
		ArrayList<String> stationLineList = new ArrayList<String>(Arrays.asList(Const.LINE_SHINAGAWA));
		lineTargetStationCntList.add(Const.ST_SHINAGAWA_TOKAIDO_HONSEN);
		lineTargetStationCntList.add(Const.ST_SHINAGAWA_YAMANOTE);
		lineTargetStationCntList.add(Const.ST_SHINAGAWA_KEIHIN_TOHOKU);
		lineTargetStationCntList.add(Const.ST_SHINAGAWA_YOKOSUKA);
		lineTargetStationCntList.add(Const.ST_SHINAGAWA_TOKAIDO_SHINKANSEN);
		lineTargetStationCntList.add(Const.ST_SHINAGAWA_KEIKYU_HONSEN);

		return stationLineList;
	}

	public static String DecideTodo() {
		String todo = null;
		int tmpTodoDecNum;

		tmpTodoDecNum = (int)Math.floor(Math.random() * 10);
		if(tmpTodoDecNum < 3) {
			todo = Const.SANSAKU_AROUND_STATION;
		} else if(tmpTodoDecNum < 5) {
			todo = Const.EAT_LUNCH;
		} else if(tmpTodoDecNum < 7) {
			todo = Const.DRINK_COFFEE;
		} else {
			todo = Const.YARITAIA_HODAI;
		}

		return todo;
	}

}
