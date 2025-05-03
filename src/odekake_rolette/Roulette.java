package odekake_rolette;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Roulette {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);

		System.out.println(Const.MSG_APP_START);
		String startCommand = scanner.nextLine();

		if(startCommand.equals(Const.COMMAND_ROULETTE_START)) {
			ArrayList<String> stationList = new ArrayList<String>(Arrays.asList(Const.START_STATION));

			//　スタートの駅を決める
			int tmpStartStationNum = 0;
			do {
				tmpStartStationNum = (int) Math.floor(Math.random() * 10);
			} while(!(tmpStartStationNum < stationList.size()));

			String startStation = stationList.get(tmpStartStationNum);

			//　乗る路線、方面を決める
			ArrayList<String> stationLineList = null;
			ArrayList<String[]> lineTargetStationCntList = new ArrayList();
			switch(startStation) {
			case "東京":
				stationLineList = new ArrayList<String>(Arrays.asList(Const.LINE_TOKYO));
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
				break;
			case "上野":
				stationLineList = new ArrayList<String>(Arrays.asList(Const.LINE_UENO));
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
				break;
			case "池袋":
				stationLineList = new ArrayList<String>(Arrays.asList(Const.LINE_IKEBUKURO));
				lineTargetStationCntList.add(Const.ST_IKEBUKURO_YAMANOTE);
				lineTargetStationCntList.add(Const.ST_IKEBUKURO_SAIKYO);
				lineTargetStationCntList.add(Const.ST_IKEBUKURO_SHONAN_SHINJUKU_TAKASAKI_ODAWARA);
				lineTargetStationCntList.add(Const.ST_IKEBUKURO_SHONAN_SHINJUKU_UTSUNOMIYA_ZUSHI);
				lineTargetStationCntList.add(Const.ST_IKEBUKURO_TOKYO_METRO_MARUNOUCHI);
				lineTargetStationCntList.add(Const.ST_IKEBUKURO_TOKYO_METRO_YURAKUCHO);
				lineTargetStationCntList.add(Const.ST_IKEBUKURO_TOKYO_METRO_FUKUTOSHIN);
				lineTargetStationCntList.add(Const.ST_IKEBUKURO_SEIBU_IKEBUKURO);
				lineTargetStationCntList.add(Const.ST_IKEBUKURO_TOBU_TOJO);
				break;
			case "新宿":
				stationLineList = new ArrayList<String>(Arrays.asList(Const.LINE_SHINJUKU));
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
				break;
			case "渋谷":
				stationLineList = new ArrayList<String>(Arrays.asList(Const.LINE_SHIBUYA));
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
				break;
			case "品川":
				stationLineList = new ArrayList<String>(Arrays.asList(Const.LINE_SHINAGAWA));
				lineTargetStationCntList.add(Const.ST_SHINAGAWA_TOKAIDO_HONSEN);
				lineTargetStationCntList.add(Const.ST_SHINAGAWA_YAMANOTE);
				lineTargetStationCntList.add(Const.ST_SHINAGAWA_KEIHIN_TOHOKU);
				lineTargetStationCntList.add(Const.ST_SHINAGAWA_YOKOSUKA);
				lineTargetStationCntList.add(Const.ST_SHINAGAWA_TOKAIDO_SHINKANSEN);
				lineTargetStationCntList.add(Const.ST_SHINAGAWA_KEIKYU_HONSEN);
				break;
			default:
				System.out.println("予期せぬエラーが発生しました。アプリケーションを終了します。");
				System.exit(1);
			}

			int tmpUseLineNum = 0;
			do {
				tmpUseLineNum = (int)Math.floor(Math.random() * 10);
			} while(tmpUseLineNum > stationLineList.size());

			String useLine = stationLineList.get(tmpUseLineNum);

			int tmpLineDecNum = 0;
			ArrayList<String> tmpLineTargetStationCnt;
			do {
				tmpLineTargetStationCnt = new ArrayList<String>(Arrays.asList(lineTargetStationCntList.get(tmpLineDecNum)));
				tmpLineDecNum++;
			} while(!tmpLineTargetStationCnt.contains(useLine));

			ArrayList<ArrayList<String>> LineTargetStationCntList = new ArrayList();
			ArrayList<String> LineTargetStationCnt = new ArrayList();
			LineTargetStationCnt.add(tmpLineTargetStationCnt.get(1));
			LineTargetStationCnt.add(tmpLineTargetStationCnt.get(2));
			LineTargetStationCntList.add(LineTargetStationCnt);
			if(tmpLineTargetStationCnt.size() == 5) {
				LineTargetStationCnt.add(tmpLineTargetStationCnt.get(3));
				LineTargetStationCnt.add(tmpLineTargetStationCnt.get(4));
				LineTargetStationCntList.add(LineTargetStationCnt);
			}

			int tmpTargetDecNum = (int)Math.floor(Math.random() * 10);
			String lineTarget = null;
			String lineStationCnt = "1";
			if(LineTargetStationCntList.size() > 1) {
				if(tmpTargetDecNum > 4) {
					lineTarget = LineTargetStationCntList.get(1).get(0);
					lineStationCnt = LineTargetStationCntList.get(1).get(1);
				}
			} else {
				lineTarget = LineTargetStationCntList.get(0).get(0);
				lineStationCnt = LineTargetStationCntList.get(0).get(1);
			}

			//　乗車する駅数を決める
			int tmpWari = 1;
			int RidingStationCnt = (int)Math.floor(Math.random() * 1000);
			while(RidingStationCnt > Integer.parseInt(lineStationCnt)) {
				tmpWari++;
				RidingStationCnt = RidingStationCnt / tmpWari;
			}

			//　やることを決める
			String todo = null;
			int tmpTodoDecNum = (int)Math.floor(Math.random() * 10);
			if(tmpTodoDecNum < 3) {
				todo = Const.SANSAKU_AROUND_STATION;
			} else if(tmpTodoDecNum < 5) {
				todo = Const.EAT_LUNCH;
			} else if(tmpTodoDecNum < 7) {
				todo = Const.DRINK_COFFEE;
			} else {
				todo = Const.YARITAIA_HODAI;
			}

			//　結果を出力する
			System.out.printf("%s駅から%sに乗って%s方面に%s駅分進んだところで%s", startStation, useLine, lineTarget, RidingStationCnt, todo);

		}

	}

}
