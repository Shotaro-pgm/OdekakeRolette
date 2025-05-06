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
		int ridingStationCnt;
		String getOffStationName = null;
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
		ridingStationCnt = DecideRidingStationCount(lineStationCnt);

		//  降車する駅名を取得する
		getOffStationName = GetGetOffStationName(startStation, useLine, lineTarget, ridingStationCnt);

		//　やることを決める
		todo = DecideTodo();

		//　結果を出力する
		System.out.printf("%s駅から%sに乗って%s方面に%s駅分進んだ%s駅で%s", startStation, useLine, lineTarget, ridingStationCnt, getOffStationName, todo);

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
		} while(tmpUseLineNum > stationLineList.size() - 1);

		useLine = stationLineList.get(tmpUseLineNum);

		return useLine;
	}

	public static ArrayList<String> DecideTargetAndStationCnt(String lineTarget, String lineStationCnt, ArrayList<String[]> lineTargetStationCntList, String useLine) {
		ArrayList<String> rstList = new ArrayList();
		ArrayList<String> tmpLineTargetStationCnt;
		int tmpLineDecNum = 0;
		ArrayList<String> lineTargetStationCnt = new ArrayList();
		ArrayList<ArrayList<String>> lineTargetStationCntMappingList = new ArrayList();
		int tmpTargetDecNum;

		do {
			tmpLineTargetStationCnt = new ArrayList<String>(Arrays.asList(lineTargetStationCntList.get(tmpLineDecNum)));
			tmpLineDecNum++;
		} while(!tmpLineTargetStationCnt.contains(useLine));

		lineTargetStationCnt.add(tmpLineTargetStationCnt.get(1));
		lineTargetStationCnt.add(tmpLineTargetStationCnt.get(2));
		lineTargetStationCntMappingList.add(lineTargetStationCnt);
		if(tmpLineTargetStationCnt.size() == 5) {
			lineTargetStationCnt.add(tmpLineTargetStationCnt.get(3));
			lineTargetStationCnt.add(tmpLineTargetStationCnt.get(4));
			lineTargetStationCntMappingList.add(lineTargetStationCnt);
		}

		tmpTargetDecNum = (int)Math.floor(Math.random() * 10);
		if(lineTargetStationCntMappingList.size() > 1) {
			if(tmpTargetDecNum > 4) {
				lineTarget = lineTargetStationCntMappingList.get(1).get(0);
				lineStationCnt = lineTargetStationCntMappingList.get(1).get(1);
			}
		} else {
			lineTarget = lineTargetStationCntMappingList.get(0).get(0);
			lineStationCnt = lineTargetStationCntMappingList.get(0).get(1);
		}

		rstList.add(lineTarget);
		rstList.add(lineStationCnt);

		return rstList;
	}

	public static int DecideRidingStationCount(String lineStationCnt) {
		int ridingStationCnt = (int)Math.floor(Math.random() * 1000);
		int tmpWari = 1;

		while(ridingStationCnt > Integer.parseInt(lineStationCnt)) {
			tmpWari++;
			ridingStationCnt = ridingStationCnt / tmpWari;
		}

		return ridingStationCnt;
	}

	public static ArrayList<String> SetTokyoStationLineList(ArrayList<String[]> lineTargetStationCntList) {
		ArrayList<String> stationLineList = new ArrayList<String>(Arrays.asList(Const.LINE_TOKYO));
		lineTargetStationCntList.add(Const.ST_TOKYO_YOKOSUKA);
		lineTargetStationCntList.add(Const.ST_TOKYO_KEIHIN_TOHOKU);
		lineTargetStationCntList.add(Const.ST_TOKYO_KEIYO);
		lineTargetStationCntList.add(Const.ST_TOKYO_YAMANOTE);
		lineTargetStationCntList.add(Const.ST_TOKYO_JOETSU_SHINKANSEN);
		lineTargetStationCntList.add(Const.ST_TOKYO_UENO_TOKYO);
		lineTargetStationCntList.add(Const.ST_TOKYO_SOBU_HONSEN);
		lineTargetStationCntList.add(Const.ST_TOKYO_CHUO_HONSEN);
		lineTargetStationCntList.add(Const.ST_TOKYO_TOKAIDO_SHINKANSEN);
		lineTargetStationCntList.add(Const.ST_TOKYO_TOKAIDO_HONSEN);
		lineTargetStationCntList.add(Const.ST_TOKYO_TOHOKU_SHINKANSEN);
		lineTargetStationCntList.add(Const.ST_TOKYO_TOHOKU_HONSEN);
		lineTargetStationCntList.add(Const.ST_TOKYO_HOKURIKU_SHINKANSEN);

		return stationLineList;
	}

	public static ArrayList<String> SetUenoStationLineList(ArrayList<String[]> lineTargetStationCntList) {
		ArrayList<String> stationLineList = new ArrayList<String>(Arrays.asList(Const.LINE_UENO));
		lineTargetStationCntList.add(Const.ST_UENO_KEIHIN_TOHOKU);
		lineTargetStationCntList.add(Const.ST_UENO_YAMANOTE);
		lineTargetStationCntList.add(Const.ST_UENO_JOETSU_SHINKANSEN);
		lineTargetStationCntList.add(Const.ST_UENO_UENO_TOKYO);
		lineTargetStationCntList.add(Const.ST_UENO_JOBAN);
		lineTargetStationCntList.add(Const.ST_UENO_TOKYO_METRO_GINZA);
		lineTargetStationCntList.add(Const.ST_UENO_TOKYO_METRO_HIBIYA);
		lineTargetStationCntList.add(Const.ST_UENO_TOHOKU_SHINKANSEN);
		lineTargetStationCntList.add(Const.ST_UENO_TOHOKU_HONSEN);
		lineTargetStationCntList.add(Const.ST_UENO_HOKURIKU_SHINKANSEN);

		return stationLineList;
	}

	public static ArrayList<String> SetIkebukuroStationLineList(ArrayList<String[]> lineTargetStationCntList) {
		ArrayList<String> stationLineList = new ArrayList<String>(Arrays.asList(Const.LINE_IKEBUKURO));
		lineTargetStationCntList.add(Const.ST_IKEBUKURO_SAIKYO);
		lineTargetStationCntList.add(Const.ST_IKEBUKURO_YAMANOTE);
		lineTargetStationCntList.add(Const.ST_IKEBUKURO_SHONAN_SHINJUKU);
		lineTargetStationCntList.add(Const.ST_IKEBUKURO_SEIBU_IKEBUKURO);
		lineTargetStationCntList.add(Const.ST_IKEBUKURO_TOKYO_METRO_MARUNOUCHI);
		lineTargetStationCntList.add(Const.ST_IKEBUKURO_TOKYO_METRO_FUKUTOSHIN);
		lineTargetStationCntList.add(Const.ST_IKEBUKURO_TOKYO_METRO_YURAKUCHO);
		lineTargetStationCntList.add(Const.ST_IKEBUKURO_TOBU_TOJO);

		return stationLineList;
	}

	public static ArrayList<String> SetShinjukuStationLineList(ArrayList<String[]> lineTargetStationCntList) {
		ArrayList<String> stationLineList = new ArrayList<String>(Arrays.asList(Const.LINE_SHINJUKU));
		lineTargetStationCntList.add(Const.ST_SHINJUKU_KEIO_SHINSEN);
		lineTargetStationCntList.add(Const.ST_SHINJUKU_KEIO);
		lineTargetStationCntList.add(Const.ST_SHINJUKU_SAIKYO);
		lineTargetStationCntList.add(Const.ST_SHINJUKU_YAMANOTE);
		lineTargetStationCntList.add(Const.ST_SHINJUKU_ODAKYU_ODAWARA);
		lineTargetStationCntList.add(Const.ST_SHINJUKU_SHONAN_SHINJUKU);
		lineTargetStationCntList.add(Const.ST_SHINJUKU_CHUO_HONSEN);
		lineTargetStationCntList.add(Const.ST_SHINJUKU_TOEI_SHINJUKU);
		lineTargetStationCntList.add(Const.ST_SHINJUKU_TOEI_OHEDO);
		lineTargetStationCntList.add(Const.ST_SHINJUKU_TOKYO_METRO_MARUNOUCHI);

		return stationLineList;
	}

	public static ArrayList<String> SetShibuyaStationLineList(ArrayList<String[]> lineTargetStationCntList) {
		ArrayList<String> stationLineList = new ArrayList<String>(Arrays.asList(Const.LINE_SHIBUYA));
		lineTargetStationCntList.add(Const.ST_SHIBUYA_KEIO_INOKASHIRA);
		lineTargetStationCntList.add(Const.ST_SHIBUYA_SAIKYO);
		lineTargetStationCntList.add(Const.ST_SHIBUYA_YAMANOTE);
		lineTargetStationCntList.add(Const.ST_SHIBUYA_SHONAN_SHINJUKU);
		lineTargetStationCntList.add(Const.ST_SHIBUYA_TOKYU_DENENTOSHI);
		lineTargetStationCntList.add(Const.ST_SHIBUYA_TOKYU_TOYOKO);
		lineTargetStationCntList.add(Const.ST_SHIBUYA_TOKYO_METRO_GINZA);
		lineTargetStationCntList.add(Const.ST_SHIBUYA_TOKYO_METRO_HANZOMON);
		lineTargetStationCntList.add(Const.ST_SHIBUYA_TOKYO_METRO_FUKUTOSHIN);

		return stationLineList;
	}

	public static ArrayList<String> SetShinagawaStationLineList(ArrayList<String[]> lineTargetStationCntList) {
		ArrayList<String> stationLineList = new ArrayList<String>(Arrays.asList(Const.LINE_SHINAGAWA));
		lineTargetStationCntList.add(Const.ST_SHINAGAWA_YOKOSUKA);
		lineTargetStationCntList.add(Const.ST_SHINAGAWA_KEKYU_HONSEN);
		lineTargetStationCntList.add(Const.ST_SHINAGAWA_KEIHIN_TOHOKU);
		lineTargetStationCntList.add(Const.ST_SHINAGAWA_YAMANOTE);
		lineTargetStationCntList.add(Const.ST_SHINAGAWA_TOKAIDO_SHINKANSEN);
		lineTargetStationCntList.add(Const.ST_SHINAGAWA_TOKAIDO_HONSEN);

		return stationLineList;
	}

	public static String GetGetOffStationName(String startStation, String useLine, String lineTarget, int ridingStationCnt) {
		String getOffStationName = null;
		ArrayList<String> lineStationList = GetLineStationList(useLine);
		int idxGetOffStation;
		int idxGetOnStation;

		if(startStation.equals(lineStationList.get(0))){
			getOffStationName = lineStationList.get(ridingStationCnt);
		} else {
			idxGetOnStation = lineStationList.indexOf(startStation);

			if(lineTarget.equals(lineStationList.get(0))) {
				idxGetOffStation = idxGetOnStation - ridingStationCnt;
			} else {
				idxGetOffStation = idxGetOnStation + ridingStationCnt;
			}

			getOffStationName = lineStationList.get(idxGetOffStation);
		}

		return getOffStationName;
	}

	public static ArrayList<String> GetLineStationList(String useLine) {
		ArrayList<String> lineStationList = null;

		switch(useLine){
		case Const.YOKOSUKA:
			lineStationList = new ArrayList<String>(Arrays.asList(Const.LN_ST_LIST_YOKOSUKA));
			break;
		case Const.KEIO_INOKASHIRA:
			lineStationList = new ArrayList<String>(Arrays.asList(Const.LN_ST_LIST_KEIO_INOKASHIRA));
			break;
		case Const.KEIO_SHINSEN:
			lineStationList = new ArrayList<String>(Arrays.asList(Const.LN_ST_LIST_KEIO_SHINSEN));
			break;
		case Const.KEIO:
			lineStationList = new ArrayList<String>(Arrays.asList(Const.LN_ST_LIST_KEIO));
			break;
		case Const.KEKYU_HONSEN:
			lineStationList = new ArrayList<String>(Arrays.asList(Const.LN_ST_LIST_KEKYU_HONSEN));
			break;
		case Const.KEIHIN_TOHOKU:
			lineStationList = new ArrayList<String>(Arrays.asList(Const.LN_ST_LIST_KEIHIN_TOHOKU));
			break;
		case Const.KEIYO:
			lineStationList = new ArrayList<String>(Arrays.asList(Const.LN_ST_LIST_KEIYO));
			break;
		case Const.TAKASAKI:
			lineStationList = new ArrayList<String>(Arrays.asList(Const.LN_ST_LIST_TAKASAKI));
			break;
		case Const.SAIKYO:
			lineStationList = new ArrayList<String>(Arrays.asList(Const.LN_ST_LIST_SAIKYO));
			break;
		case Const.YAMANOTE:
			lineStationList = new ArrayList<String>(Arrays.asList(Const.LN_ST_LIST_YAMANOTE));
			break;
		case Const.ODAKYU_ODAWARA:
			lineStationList = new ArrayList<String>(Arrays.asList(Const.LN_ST_LIST_ODAKYU_ODAWARA));
			break;
		case Const.SHONAN_SHINJUKU:
			lineStationList = new ArrayList<String>(Arrays.asList(Const.LN_ST_LIST_SHONAN_SHINJUKU));
			break;
		case Const.JOETSU_SHINKANSEN:
			lineStationList = new ArrayList<String>(Arrays.asList(Const.LN_ST_LIST_JOETSU_SHINKANSEN));
			break;
		case Const.UENO_TOKYO:
			lineStationList = new ArrayList<String>(Arrays.asList(Const.LN_ST_LIST_UENO_TOKYO));
			break;
		case Const.JOBAN:
			lineStationList = new ArrayList<String>(Arrays.asList(Const.LN_ST_LIST_JOBAN));
			break;
		case Const.SEIBU_IKEBUKURO:
			lineStationList = new ArrayList<String>(Arrays.asList(Const.LN_ST_LIST_SEIBU_IKEBUKURO));
			break;
		case Const.SOBU_HONSEN:
			lineStationList = new ArrayList<String>(Arrays.asList(Const.LN_ST_LIST_SOBU_HONSEN));
			break;
		case Const.CHUO:
			lineStationList = new ArrayList<String>(Arrays.asList(Const.LN_ST_LIST_CHUO_HONSEN));
			break;
		case Const.CHUO_HONSEN:
			lineStationList = new ArrayList<String>(Arrays.asList(Const.LN_ST_LIST_CHUO_HONSEN));
			break;
		case Const.TOEI_SHINJUKU:
			lineStationList = new ArrayList<String>(Arrays.asList(Const.LN_ST_LIST_TOEI_SHINJUKU));
			break;
		case Const.TOEI_OHEDO:
			lineStationList = new ArrayList<String>(Arrays.asList(Const.LN_ST_LIST_TOEI_OHEDO));
			break;
		case Const.TOKAIDO_SHINKANSEN:
			lineStationList = new ArrayList<String>(Arrays.asList(Const.LN_ST_LIST_TOKAIDO_SHINKANSEN));
			break;
		case Const.TOKAIDO_HONSEN:
			lineStationList = new ArrayList<String>(Arrays.asList(Const.LN_ST_LIST_TOKAIDO_HONSEN));
			break;
		case Const.TOKYU_DENENTOSHI:
			lineStationList = new ArrayList<String>(Arrays.asList(Const.LN_ST_LIST_TOKYU_DENENTOSHI));
			break;
		case Const.TOKYU_TOYOKO:
			lineStationList = new ArrayList<String>(Arrays.asList(Const.LN_ST_LIST_TOKYU_TOYOKO));
			break;
		case Const.TOKYO_METRO_MARUNOUCHI:
			lineStationList = new ArrayList<String>(Arrays.asList(Const.LN_ST_LIST_TOKYO_METRO_MARUNOUCHI));
			break;
		case Const.TOKYO_METRO_GINZA:
			lineStationList = new ArrayList<String>(Arrays.asList(Const.LN_ST_LIST_TOKYO_METRO_GINZA));
			break;
		case Const.TOKYO_METRO_HIBIYA:
			lineStationList = new ArrayList<String>(Arrays.asList(Const.LN_ST_LIST_TOKYO_METRO_HIBIYA));
			break;
		case Const.TOKYO_METRO_HANZOMON:
			lineStationList = new ArrayList<String>(Arrays.asList(Const.LN_ST_LIST_TOKYO_METRO_HANZOMON));
			break;
		case Const.TOKYO_METRO_FUKUTOSHIN:
			lineStationList = new ArrayList<String>(Arrays.asList(Const.LN_ST_LIST_TOKYO_METRO_FUKUTOSHIN));
			break;
		case Const.TOKYO_METRO_YURAKUCHO:
			lineStationList = new ArrayList<String>(Arrays.asList(Const.LN_ST_LIST_TOKYO_METRO_YURAKUCHO));
			break;
		case Const.TOBU_TOJO:
			lineStationList = new ArrayList<String>(Arrays.asList(Const.LN_ST_LIST_TOBU_TOJO));
			break;
		case Const.TOHOKU_SHINKANSEN:
			lineStationList = new ArrayList<String>(Arrays.asList(Const.LN_ST_LIST_TOHOKU_SHINKANSEN));
			break;
		case Const.TOHOKU_HONSEN:
			lineStationList = new ArrayList<String>(Arrays.asList(Const.LN_ST_LIST_TOHOKU_HONSEN));
			break;
		case Const.HOKURIKU_SHINKANSEN:
			lineStationList = new ArrayList<String>(Arrays.asList(Const.LN_ST_LIST_HOKURIKU_SHINKANSEN));
			break;
		}

		return lineStationList;

	}

	public static String DecideTodo() {
		String todo = null;
		int tmpTodoDecNum;
		ArrayList<String> todoList = new ArrayList<String>(Arrays.asList(Const.TODO_LIST));

		do {
			tmpTodoDecNum = (int)Math.floor(Math.random() * 10);
		}while(tmpTodoDecNum > (todoList.size() - 1));

		todo = todoList.get(tmpTodoDecNum);

		return todo;
	}

}
