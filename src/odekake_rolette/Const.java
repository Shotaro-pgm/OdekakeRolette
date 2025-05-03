package odekake_rolette;

public class Const {
	//　コマンド
	final static String COMMAND_ROULETTE_START = "行き先を決める";



	//　メッセージ
	final static String MSG_APP_START = "\"行き先を決める\"コマンド実行で行き先とルートを決めます。";
	final static String MSG_ERR_ELEAGAL_COMMAND = "起動コマンドが違います。再度アプリケーションを実行してください。";


	//　駅名
	final static String ST_TOKYO = "東京";
	final static String ST_UENO = "上野";
	final static String ST_IKEBUKURO = "池袋";
	final static String ST_SHINJUKU = "新宿";
	final static String ST_SHIBUYA = "渋谷";
	final static String ST_SHINAGAWA = "品川";
	final static String[] START_STATION = {"東京", "上野", "池袋", "新宿", "渋谷", "品川"};
	final static String[] LINE_TOKYO = {"東海道本線", "山手線", "京浜東北線", "横須賀線", "総武本線", "京葉線", "中央線", "中央本線", "上野東京ライン", "東北新幹線", "上越新幹線", "北陸新幹線", "東海道新幹線", "東京メトロ丸の内線"};
	final static String[] LINE_UENO = {"山手線", "京浜東北線", "東北本線", "常磐線", "高崎線", "上野東京ライン", "東北新幹線", "上越新幹線", "北陸新幹線", "東京メトロ銀座線", "東京メトロ日比谷線"};
	final static String[] LINE_IKEBUKURO = {"山手線", "埼京線", "湘南新宿ライン（高崎/小田原）", "湘南新宿ライン（宇都宮/逗子）", "東京メトロ丸の内線", "東京メトロ有楽町線", "東京メトロ副都心線", "西武池袋線", "東武東上線"};
	final static String[] LINE_SHINJUKU = {"山手線", "総武線", "埼京線", "中央線", "中央本線", "湘南新宿ライン（高崎/小田原）", "湘南新宿ライン（宇都宮/逗子）", "都営新宿線", "都営大江戸線", "京王線", "京王新線", "小田急小田原線"};
	final static String[] LINE_SHIBUYA = {"山手線", "埼京線", "湘南新宿ライン（高崎/小田原）", "湘南新宿ライン（宇都宮/逗子）", "東京メトロ銀座線", "東京メトロ半蔵門線", "東京メトロ副都心線", "京王井の頭線", "東急東横線", "東急田園都市線"};
	final static String[] LINE_SHINAGAWA = {"東海道本線", "山手線", "京浜東北線", "横須賀線", "東海道新幹線", "京急本線"};



	//　路線名
	final static String YOKOSUKA = "横須賀線";
	final static String KEIO_INOKASHIRA = "京王井の頭線";
	final static String KEIO_SHINSEN = "京王新線";
	final static String KEIO = "京王線";
	final static String KEKYU_HONSEN = "京急本線";
	final static String KEIHIN_TOHOKU = "京浜東北線";
	final static String KEIYO = "京葉線";
	final static String TAKASAKI = "高崎線";
	final static String SAIKYO = "埼京線";
	final static String YAMANOTE = "山手線";
	final static String ODAKYU_ODAWARA = "小田急小田原線";
	final static String SHONAN_SHINJUKU_UTSUNOMIYA_ZUSHI = "湘南新宿ライン（宇都宮/逗子）";
	final static String SHONAN_SHINJUKU_TAKASAKI_ODAWARA = "湘南新宿ライン（高崎/小田原）";
	final static String JOETSU_SHINKANSEN = "上越新幹線";
	final static String UENO_TOKYO = "上野東京ライン";
	final static String JOBAN = "常磐線";
	final static String SEIBU_IKEBUKURO = "西武池袋線";
	final static String SOBU = "総武線";
	final static String SOBU_HONSEN = "総武本線";
	final static String CHUO = "中央線";
	final static String CHUO_HONSEN = "中央本線";
	final static String TOEI_SHINJUKU = "都営新宿線";
	final static String TOEI_OHEDO = "都営大江戸線";
	final static String TOKAIDO_SHINKANSEN = "東海道新幹線";
	final static String TOKAIDO_HONSEN = "東海道本線";
	final static String TOKYU_DENENTOSHI = "東急田園都市線";
	final static String TOKYU_TOYOKO = "東急東横線";
	final static String TOKYO_METRO_MARUNOUCHI = "東京メトロ丸の内線";
	final static String TOKYO_METRO_GINZA = "東京メトロ銀座線";
	final static String TOKYO_METRO_HIBIYA = "東京メトロ日比谷線";
	final static String TOKYO_METRO_HANZOMON = "東京メトロ半蔵門線";
	final static String TOKYO_METRO_FUKUTOSHIN = "東京メトロ副都心線";
	final static String TOKYO_METRO_YURAKUCHO = "東京メトロ有楽町線";
	final static String TOBU_TOJO = "東武東上線";
	final static String TOHOKU_SHINKANSEN = "東北新幹線";
	final static String TOHOKU_HONSEN = "東北本線";
	final static String HOKURIKU_SHINKANSEN = "北陸新幹線";



	//　各路線の上り下りの駅数(路線名, 方面1, 方面1への駅数(, 方面2, 方面2への駅数）)
	//　東京駅
	final static String[] ST_TOKYO_TOKAIDO_HONSENN = {TOKAIDO_HONSEN, "熱海", "20"};
	final static String[] ST_TOKYO_YAMANOTE = {YAMANOTE, "大崎", "23", "品川", "6"};
	final static String[] ST_TOKYO_KEIHIN_TOHOKU = {KEIHIN_TOHOKU, "大宮", "21", "横浜", "14"};
	final static String[] ST_TOKYO_YOKOSUKA = {YOKOSUKA, "久里浜", "18"};
	final static String[] ST_TOKYO_SOBU_HONSEN = {SOBU_HONSEN, "銚子", "30"};
	final static String[] ST_TOKYO_KEIO = {KEIO, "蘇我", "17"};
	final static String[] ST_TOKYO_CHUO = {CHUO, "高尾", "23"};
	final static String[] ST_TOKYO_CHUO_HONSEN = {CHUO_HONSEN, "松本", "50"};
	final static String[] ST_TOKYO_UENO_TOKYO = {UENO_TOKYO, "上野", "1"};
	final static String[] ST_TOKYO_TOHOKU_SHINKANSEN = {TOHOKU_SHINKANSEN, "新青森", "22"};
	final static String[] ST_TOKYO_JOETSU_SHINKANSEN = {JOETSU_SHINKANSEN, "新潟", "11"};
	final static String[] ST_TOKYO_HOKURIKU_SHINKANSEN = {HOKURIKU_SHINKANSEN, "上越妙高", "12"};
	final static String[] ST_TOKYO_TOKAIDO_SHINKANSEN = {TOKAIDO_SHINKANSEN, "新大阪", "16"};
	final static String[] ST_TOKYO_TOKYO_METRO_MARUNOUCHI = {TOKYO_METRO_MARUNOUCHI, "大宮", "21", "横浜", "14"};

	//　上野
	final static String[] ST_UENO_YAMANOTE = {YAMANOTE, "大崎", "19", "品川", "10"};
	final static String[] ST_UENO_KEIHIN_TOHOKU = {KEIHIN_TOHOKU, "大宮", "17", "横浜", "18"};
	final static String[] ST_UENO_TOHOKU_HONSEN = {TOHOKU_HONSEN, "盛岡", "114"};
	final static String[] ST_UENO_JOBAN = {JOBAN, "仙台", "77"};
	final static String[] ST_UENO_TAKASAKI = {TAKASAKI, "高崎", "23"};
	final static String[] ST_UENO_UENO_TOKYO = {UENO_TOKYO, "東京", "1"};
	final static String[] ST_UENO_TOHOKU_SHINKANSEN = {TOHOKU_SHINKANSEN, "新青森", "21"};
	final static String[] ST_UENO_JOETSU_SHINKANSEN = {JOETSU_SHINKANSEN, "新潟", "10"};
	final static String[] ST_UENO_HOKURIKU_SHINKANSEN = {HOKURIKU_SHINKANSEN, "上越妙高", "11"};
	final static String[] ST_UENO_TOKYO_METRO_GINZA = {TOKYO_METRO_GINZA, "浅草", "3", "渋谷", "15"};
	final static String[] ST_UENO_TOKYO_METRO_HIBIYA = {TOKYO_METRO_HIBIYA, "北千住", "4", "中目黒", "17"};

	//　池袋
	final static String[] ST_IKEBUKURO_YAMANOTE = {YAMANOTE, "大崎", "11", "品川", "18"};
	final static String[] ST_IKEBUKURO_SAIKYO = {SAIKYO, "大崎", "4", "大宮", "14"};
	final static String[] ST_IKEBUKURO_SHONAN_SHINJUKU_TAKASAKI_ODAWARA = {SHONAN_SHINJUKU_TAKASAKI_ODAWARA, "高崎", "21", "小田原", "21"};
	final static String[] ST_IKEBUKURO_SHONAN_SHINJUKU_UTSUNOMIYA_ZUSHI = {SHONAN_SHINJUKU_UTSUNOMIYA_ZUSHI, "宇都宮", "20", "逗子", "15"};
	final static String[] ST_IKEBUKURO_TOKYO_METRO_MARUNOUCHI = {TOKYO_METRO_MARUNOUCHI, "荻窪", "24"};
	final static String[] ST_IKEBUKURO_TOKYO_METRO_YURAKUCHO = {TOKYO_METRO_YURAKUCHO, "和光市", "8"};
	final static String[] ST_IKEBUKURO_TOKYO_METRO_FUKUTOSHIN = {TOKYO_METRO_FUKUTOSHIN, "和光市", "8", "渋谷", "7"};
	final static String[] ST_IKEBUKURO_SEIBU_IKEBUKURO = {SEIBU_IKEBUKURO, "吾野", "30"};
	final static String[] ST_IKEBUKURO_TOBU_TOJO = {TOBU_TOJO, "寄居", "38"};

	//　新宿
	final static String[] ST_SHINJUKU_YAMANOTE = {YAMANOTE, "大崎", "7", "品川", "22"};
	final static String[] ST_SHINJUKU_SOBU = {SOBU, "千葉", "29", "三鷹", "9"};
	final static String[] ST_SHINJUKU_SAIKYO = {SAIKYO, "大崎", "3", "大宮", "15"};
	final static String[] ST_SHINJUKU_CHUO = {CHUO, "東京", "4", "高尾", "19"};
	final static String[] ST_SHINJUKU_CHUO_HONSEN = {CHUO_HONSEN, "東京", "1", "松本", "49"};
	final static String[] ST_SHINJUKU_SHONAN_SHINJUKU_TAKASAKI_ODAWARA = {SHONAN_SHINJUKU_TAKASAKI_ODAWARA, "高崎", "21", "小田原", "20"};
	final static String[] ST_SHINJUKU_SHONAN_SHINJUKU_UTSUNOMIYA_ZUSHI = {SHONAN_SHINJUKU_UTSUNOMIYA_ZUSHI, "宇都宮", "21", "逗子", "14"};
	final static String[] ST_SHINJUKU_TOEI_SHINJUKU = {TOEI_SHINJUKU, "本八幡", "20"};
	final static String[] ST_SHINJUKU_TOEI_OHEDO = {TOEI_OHEDO, "都庁前", "27", "光が丘", "10"};
	final static String[] ST_SHINJUKU_KEIO = {KEIO, "京王八王子", "31"};
	final static String[] ST_SHINJUKU_KEIO_SHINSEN = {KEIO_SHINSEN, "笹塚", "3"};
	final static String[] ST_SHINJUKU_ODAKYU_ODAWARA = {ODAKYU_ODAWARA, "小田原", "46"};

	//　渋谷
	final static String[] ST_SHIBUYA_YAMANOTE = {YAMANOTE, "大崎", "4", "品川", "25"};
	final static String[] ST_SHIBUYA_SAIKYO = {SAIKYO, "大崎", "2", "大宮", "16"};
	final static String[] ST_SHIBUYA_SHONAN_SHINJUKU_TAKASAKI_ODAWARA = {SHONAN_SHINJUKU_TAKASAKI_ODAWARA, "高崎", "22", "小田原", "19"};
	final static String[] ST_SHIBUYA_SHONAN_SHINJUKU_UTSUNOMIYA_ZUSHI = {SHONAN_SHINJUKU_UTSUNOMIYA_ZUSHI, "宇都宮", "22", "逗子", "13"};
	final static String[] ST_SHIBJYA_TOKYO_METRO_GINA = {TOKYO_METRO_GINZA, "浅草", "18"};
	final static String[] ST_SHIBJYA_TOKYO_METRO_HANZOMON = {TOKYO_METRO_HANZOMON, "押上", "13"};
	final static String[] ST_SHIBJYA_TOKYO_METRO_FUKUTOSHIN = {TOKYO_METRO_FUKUTOSHIN, "和光市", "15"};
	final static String[] ST_SHIBUYA_KEIO_INOKASHIRA = {KEIO_INOKASHIRA, "吉祥寺", "16"};
	final static String[] ST_SHIBUYA_TOKYU_TOYOKO = {TOKYU_TOYOKO, "横浜", "20"};
	final static String[] ST_SHIBUYA_TOKYU_DENENTOSHI = {TOKYU_DENENTOSHI, "中央林間", "26"};

	//　品川
	final static String[] ST_SHINAGAWA_TOKAIDO_HONSEN = {TOKAIDO_HONSEN, "東京", "2", "熱海", "18"};
	final static String[] ST_SHINAGAWA_YAMANOTE = {YAMANOTE, "大崎", "29"};
	final static String[] ST_SHINAGAWA_KEIHIN_TOHOKU = {KEIHIN_TOHOKU, "大宮", "27", "横浜", "8"};
	final static String[] ST_SHINAGAWA_YOKOSUKA = {YOKOSUKA, "東京", "2", "久里浜", "16"};
	final static String[] ST_SHINAGAWA_TOKAIDO_SHINKANSEN = {TOKAIDO_SHINKANSEN, "新大阪", "15"};
	final static String[] ST_SHINAGAWA_KEIKYU_HONSEN = {KEKYU_HONSEN, "泉岳寺", "1", "浦賀", "48"};



	//　やること
	final static String YARITAIA_HODAI = "やりたい放題してください！";
	final static String SANSAKU_AROUND_STATION = "駅周辺を散策してください！";
	final static String EAT_LUNCH = "お昼ごはんを食べてください！";
	final static String DRINK_COFFEE = "カフェタイムにしましょう！";

}
