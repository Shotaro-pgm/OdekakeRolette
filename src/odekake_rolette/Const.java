package odekake_rolette;

public class Const {
	//  コマンド
	final static String COMMAND_ROULETTE_START = "行き先を決める";

	//  メッセージ
	final static String MSG_APP_START = "\"行き先を決める\"コマンド実行で行き先とルートを決めます。";
	final static String MSG_ERR_ELEAGAL_COMMAND = "起動コマンドが違います。再度アプリケーションを実行してください。";

	//  路線名
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
	final static String SHONAN_SHINJUKU = "湘南新宿ライン";
//	final static String SHONAN_SHINJUKU_TAKASAKI_ODAWARA = "湘南新宿ライン（高崎/小田原）";
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

	//  駅名
	final static String ST_TOKYO = "東京";
	final static String ST_UENO = "上野";
	final static String ST_IKEBUKURO = "池袋";
	final static String ST_SHINJUKU = "新宿";
	final static String ST_SHIBUYA = "渋谷";
	final static String ST_SHINAGAWA = "品川";
	final static String[] START_STATION = {ST_TOKYO, ST_UENO, ST_IKEBUKURO, ST_SHINJUKU, ST_SHIBUYA, ST_SHINAGAWA};
	final static String[] LINE_TOKYO = {TOKAIDO_HONSEN, YAMANOTE, KEIHIN_TOHOKU, YOKOSUKA, SOBU_HONSEN, KEIYO, CHUO, CHUO_HONSEN, UENO_TOKYO, TOHOKU_SHINKANSEN, JOETSU_SHINKANSEN, HOKURIKU_SHINKANSEN, TOKAIDO_SHINKANSEN, TOKYO_METRO_MARUNOUCHI};
	final static String[] LINE_UENO = {YAMANOTE, KEIHIN_TOHOKU, TOHOKU_HONSEN, JOBAN, TAKASAKI, UENO_TOKYO, TOHOKU_SHINKANSEN, JOETSU_SHINKANSEN, HOKURIKU_SHINKANSEN, TOKYO_METRO_GINZA, TOKYO_METRO_HIBIYA};
	final static String[] LINE_IKEBUKURO = {YAMANOTE, SAIKYO, SHONAN_SHINJUKU, TOKYO_METRO_MARUNOUCHI, TOKYO_METRO_YURAKUCHO, TOKYO_METRO_FUKUTOSHIN, SEIBU_IKEBUKURO, TOBU_TOJO};
	final static String[] LINE_SHINJUKU = {YAMANOTE, SOBU, SAIKYO, CHUO, CHUO_HONSEN, SHONAN_SHINJUKU, TOEI_SHINJUKU, TOEI_OHEDO, KEIO, KEIO_SHINSEN, ODAKYU_ODAWARA};
	final static String[] LINE_SHIBUYA = {YAMANOTE, SAIKYO, SHONAN_SHINJUKU, TOKYO_METRO_GINZA, TOKYO_METRO_HANZOMON, TOKYO_METRO_FUKUTOSHIN, KEIO_INOKASHIRA, TOKYU_TOYOKO, TOKYU_DENENTOSHI};
	final static String[] LINE_SHINAGAWA = {TOKAIDO_HONSEN, YAMANOTE, KEIHIN_TOHOKU, YOKOSUKA, TOKAIDO_SHINKANSEN, KEKYU_HONSEN};

	//  路線ごとの駅リスト
	final static String[] LN_ST_LIST_YOKOSUKA = {"東京", "新橋", "品川", "西大井", "武蔵小杉", "新川崎", "横浜", "保土ヶ谷", "東戸塚", "大船",
			"北鎌倉", "鎌倉", "逗子", "東逗子", "田浦", "横須賀", "衣笠", "久里浜"};
	final static String[] LN_ST_LIST_KEIO_INOKASHIRA= {"渋谷", "新泉", "駒場東大前", "池ノ上", "下北沢", "新代田", "東松原", "明大前", "永福町", "浜田山",
			"高井戸", "富士見ヶ丘", "久我山", "三鷹台", "井の頭公園", "吉祥寺"};
	final static String[] LN_ST_LIST_KEIO_SHINSEN= {"笹塚", "幡ヶ谷", "初台", "新宿"};
	final static String[] LN_ST_LIST_KEIO= {"新宿", "笹塚", "代田橋", "明大前", "下高井戸", "桜上水", "上北沢", "八幡山", "芦花公園", "千歳烏山",
			"仙川", "つつじヶ丘", "柴崎", "国領", "布田", "調布", "西調布", "飛田給", "武蔵野台", "多摩霊園",
			"東府中", "府中", "分倍河原", "中河原", "聖蹟桜ヶ丘", "百草園", "高幡不動", "南平", "平山城址公園", "長沼(東京都)", "北野(東京都)", "京王八王子"};
	final static String[] LN_ST_LIST_KEKYU_HONSEN= {"泉岳寺", "品川", "北品川", "新馬場", "青物横丁", "鮫洲", "立会川", "大森海岸", "平和島", "大森町",
			"梅屋敷", "京急蒲田", "雑色", "六郷土手", "京急川崎", "八丁畷", "鶴見市場", "京急鶴見", "花月総持寺", "生麦",
			"京急新子安", "子安", "神奈川新町", "京急東神奈川", "神奈川", "横浜", "戸部", "日ノ出町", "黄金町", "南太田",
			"井土ヶ谷", "弘明寺", "上大岡", "屏風浦", "杉田", "京急富岡", "能見台", "金沢文庫", "金沢八景", "追浜",
			"京急田浦", "安針塚", "逸見", "汐入", "横須賀中央", "県立大学", "堀ノ内", "京急大津", "馬堀海岸", "浦賀"};
	final static String[] LN_ST_LIST_KEIHIN_TOHOKU= {"大宮", "さいたま新都心", "与野", "北浦和", "浦和", "南浦和", "蕨", "西川口", "川口", "赤羽",
			"東十条", "王子", "上中里", "田端", "西日暮里", "日暮里", "鶯谷", "上野", "御徒町", "秋葉原",
			"神田", "東京", "有楽町", "新橋", "浜松町", "田町", "高輪ゲートウェイ", "品川", "大井町", "大森",
			"蒲田", "川崎", "鶴見", "新子安", "東神奈川", "横浜"};
	final static String[] LN_ST_LIST_KEIYO= {"東京", "八丁堀", "越中島", "潮見", "新木場", "葛西臨海公園", "舞浜", "新浦安", "市川塩浜", "二俣新町",
			"南船橋", "新習志野", "幕張豊砂", "海浜幕張", "検見川浜", "稲毛海岸", "千葉みなと", "蘇我"};
	final static String[] LN_ST_LIST_TAKASAKI= {"大宮", "宮原", "上尾", "北上尾", "桶川", "北本", "鴻巣", "北鴻巣", "吹上", "行田",
			"熊谷", "籠原", "深谷", "岡部", "本庄", "神保原", "新町", "倉賀野", "高崎"};
	final static String[] LN_ST_LIST_SAIKYO= {"大崎", "恵比寿", "渋谷", "新宿", "池袋", "板橋", "十条", "赤羽", "北赤羽", "浮間舟渡",
			"戸田公園", "戸田", "北戸田", "武蔵浦和", "中浦和", "南与野", "与野本町", "北与野", "大宮"};
	final static String[] LN_ST_LIST_YAMANOTE= {"大崎", "五反田", "目黒", "恵比寿", "渋谷", "原宿", "代々木", "新宿", "新大久保", "高田馬場",
			"目白", "池袋", "大塚", "巣鴨", "駒込", "田端", "西日暮里", "日暮里", "鶯谷", "上野",
			"御徒町", "秋葉原", "神田", "東京", "有楽町", "新橋", "浜松町", "田町", "高輪ゲートウェイ", "品川"};
	final static String[] LN_ST_LIST_ODAKYU_ODAWARA= {"新宿", "南新宿", "参宮橋", "代々木八幡", "代々木上原", "東北沢", "下北沢", "世田谷代田", "梅ヶ丘", "豪徳寺",
			"経堂", "千歳船橋", "祖師ヶ谷大蔵", "成城学園前", "喜多見", "狛江", "和泉多摩川", "登戸", "生田", "読売ランド前",
			"百合ヶ丘", "新百合ヶ丘", "柿生", "鶴川", "玉川学園前", "町田", "相模大野", "小田急相模原", "相武台前", "座間",
			"海老名", "厚木", "本厚木", "愛甲石田", "伊勢原", "鶴巻温泉", "東海大学前", "秦野", "渋沢", "新松田",
			"開成", "栢山", "富水", "螢田", "足柄", "小田原"};
	final static String[] LN_ST_LIST_SHONAN_SHINJUKU= {"西大井", "大崎", "恵比寿", "渋谷", "新宿", "池袋", "赤羽"};
	final static String[] LN_ST_LIST_JOETSU_SHINKANSEN= {"東京", "上野", "大宮", "熊谷", "本庄早稲田", "高崎", "上毛高原", "越後湯沢", "浦佐", "長岡", "燕三条", "新潟"};
	final static String[] LN_ST_LIST_UENO_TOKYO= {"東京", "上野", "尾久", "赤羽", "浦和", "さいたま新都心", "大宮", "土呂", "東大宮", "蓮田",
			"白岡", "新白岡", "久喜", "東鷲宮", "栗橋", "古河", "野木", "間々田", "小山", "小金井",
			"自治医大", "石橋", "雀宮", "宇都宮", "岡本", "宝積寺", "氏家", "蒲須坂", "片岡", "矢板",
			"野崎", "西那須野", "那須塩原", "黒磯"};
	final static String[] LN_ST_LIST_JOBAN= {"上野", "日暮里", "三河島", "南千住", "北千住", "綾瀬", "亀有", "金町", "松戸", "北松戸",
			"馬橋", "新松戸", "北小金", "南柏", "柏", "北柏", "我孫子", "天王台", "取手", "藤代",
			"龍ケ崎市", "牛久", "ひたち野うしく", "荒川沖", "土浦", "神立", "高浜", "石岡", "羽鳥", "岩間",
			"友部", "内原", "赤塚", "偕楽園", "水戸", "勝田", "佐和", "東海", "大甕", "常陸多賀",
			"日立", "小木津", "十王", "高萩", "南中郷", "磯原", "大津港", "勿来", "植田", "泉",
			"湯本", "内郷", "いわき", "草野", "四ツ倉", "久ノ浜", "末続", "広野", "Ｊヴィレッジ", "木戸",
			"竜田", "富岡", "夜ノ森", "大野", "双葉", "浪江", "桃内", "小高", "磐城太田", "原ノ町",
			"鹿島", "日立木", "相馬", "駒ヶ嶺", "新地", "坂元", "山下", "浜吉田", "亘理", "逢隈", "岩沼"};
	final static String[] LN_ST_LIST_SEIBU_IKEBUKURO= {"池袋", "椎名町", "東長崎", "江古田", "桜台", "練馬", "中村橋", "富士見台", "練馬高野台", "石神井公園",
			"大泉学園", "保谷", "ひばりヶ丘", "東久留米", "清瀬", "秋津", "所沢", "西所沢", "小手指", "狭山ヶ丘",
			"武蔵藤沢", "稲荷山公園", "入間市", "仏子", "元加治", "飯能"};
	final static String[] LN_ST_LIST_SOBU_HONSEN= {"東京", "新日本橋", "馬喰町", "錦糸町", "亀戸", "平井", "新小岩", "小岩", "市川", "本八幡",
			"下総中山", "西船橋", "船橋", "東船橋", "津田沼", "幕張本郷", "幕張", "新検見川", "稲毛", "西千葉",
			"千葉", "東千葉", "都賀", "四街道", "物井", "佐倉", "南酒々井", "榎戸", "八街", "日向",
			"成東", "松尾", "横芝", "飯倉", "八日市場", "干潟", "旭", "飯岡", "倉橋", "猿田", "松岸", "銚子"};
	final static String[] LN_ST_LIST_CHUO_HONSEN= {"東京", "神田", "御茶ノ水", "水道橋", "飯田橋", "市ヶ谷", "四ツ谷", "信濃町", "千駄ヶ谷", "代々木",
			"新宿", "大久保", "東中野", "中野", "高円寺", "阿佐ヶ谷", "荻窪", "西荻窪", "吉祥寺", "三鷹",
			"武蔵境", "東小金井", "武蔵小金井", "国分寺", "西国分寺", "国立", "立川", "日野", "豊田", "八王子",
			"西八王子", "高尾", "相模湖", "藤野", "上野原", "四方津", "梁川", "鳥沢", "猿橋", "大月",
			"初狩", "笹子", "甲斐大和", "勝沼ぶどう郷", "塩山", "東山梨", "山梨市", "春日居町", "石和温泉", "酒折",
			"甲府", "竜王", "塩崎", "韮崎", "新府", "穴山", "日野春", "長坂", "小淵沢", "信濃境",
			"富士見", "すずらんの里", "青柳", "茅野", "上諏訪", "下諏訪", "岡谷", "みどり湖", "塩尻"};
	final static String[] LN_ST_LIST_TOEI_SHINJUKU= {"新宿", "新宿三丁目", "曙橋", "市ヶ谷", "九段下", "神保町", "小川町", "岩本町", "馬喰横山", "浜町", "森下", "菊川", "住吉", "西大島", "大島", "東大島", "船堀", "一之江", "瑞江", "篠崎", "本八幡"};
	final static String[] LN_ST_LIST_TOEI_OHEDO= {"光が丘", "練馬春日町", "豊島園", "練馬", "新江古田", "落合南長崎", "中井", "東中野", "中野坂上", "西新宿五丁目",
			"都庁前", "新宿", "代々木", "国立競技場", "青山一丁目", "六本木", "麻布十番", "赤羽橋", "大門", "汐留",
			"築地市場", "勝どき", "月島", "門前仲町", "清澄白河", "森下", "両国", "蔵前", "新御徒町", "上野御徒町",
			"本郷三丁目", "春日", "飯田橋", "牛込神楽坂", "牛込柳町", "若松河田", "東新宿", "新宿西口", "都庁前"};
	final static String[] LN_ST_LIST_TOKAIDO_SHINKANSEN= {"東京", "品川", "新横浜", "小田原", "熱海", "三島", "新富士", "静岡", "掛川", "浜松",
			"豊橋", "三河安城", "名古屋", "岐阜羽島", "米原", "京都", "新大阪"};
	final static String[] LN_ST_LIST_TOKAIDO_HONSEN= {"東京", "新橋", "品川", "川崎", "横浜", "戸塚", "大船", "藤沢", "辻堂", "茅ヶ崎",
			"平塚", "大磯", "二宮", "国府津", "鴨宮", "小田原", "早川", "根府川", "真鶴", "湯河原", "熱海"};
	final static String[] LN_ST_LIST_TOKYU_DENENTOSHI= {"渋谷", "池尻大橋", "三軒茶屋", "駒沢大学", "桜新町", "用賀", "二子玉川", "二子新地", "高津", "溝の口",
			"梶が谷", "宮崎台", "宮前平", "鷺沼", "たまプラーザ", "あざみ野", "江田", "市が尾", "藤が丘", "青葉台",
			"田奈", "長津田", "つくし野", "すずかけ台", "南町田グランベリーパーク", "つきみ野", "中央林間"};
	final static String[] LN_ST_LIST_TOKYU_TOYOKO= {"渋谷", "代官山", "中目黒", "祐天寺", "学芸大学", "都立大学", "自由が丘", "田園調布", "多摩川", "新丸子",
			"武蔵小杉", "元住吉", "日吉", "綱島", "大倉山", "菊名", "妙蓮寺", "白楽", "東白楽", "反町", "横浜"};
	final static String[] LN_ST_LIST_TOKYO_METRO_MARUNOUCHI= {"渋谷", "代官山", "中目黒", "祐天寺", "学芸大学", "都立大学", "自由が丘", "田園調布", "多摩川", "新丸子",
			"武蔵小杉", "元住吉", "日吉", "綱島", "大倉山", "菊名", "妙蓮寺", "白楽", "東白楽", "反町", "横浜"};
	final static String[] LN_ST_LIST_TOKYO_METRO_GINZA= {"浅草", "田原町", "稲荷町", "上野", "上野広小路", "末広町", "神田", "三越前", "日本橋", "京橋",
			"銀座", "新橋", "虎ノ門", "溜池山王", "赤坂見附", "青山一丁目", "外苑前", "表参道", "渋谷"};
	final static String[] LN_ST_LIST_TOKYO_METRO_HIBIYA= {"北千住", "南千住", "三ノ輪", "入谷", "上野", "仲御徒町", "秋葉原", "小伝馬町", "人形町", "茅場町",
			"八丁堀", "築地", "東銀座", "銀座", "日比谷", "霞ヶ関", "虎ノ門ヒルズ", "神谷町", "六本木", "広尾", "恵比寿", "中目黒"};
	final static String[] LN_ST_LIST_TOKYO_METRO_HANZOMON= {"押上[スカイツリー前]", "錦糸町", "住吉", "清澄白河", "水天宮前", "三越前", "大手町", "神保町", "九段下", "半蔵門",
			"永田町", "青山一丁目", "表参道", "渋谷"};
	final static String[] LN_ST_LIST_TOKYO_METRO_FUKUTOSHIN= {"小竹向原", "千川", "要町", "池袋", "雑司が谷", "西早稲田", "東新宿", "新宿三丁目", "北参道", "明治神宮前", "渋谷"};
	final static String[] LN_ST_LIST_TOKYO_METRO_YURAKUCHO= {"和光市", "地下鉄成増", "地下鉄赤塚", "平和台", "氷川台", "小竹向原", "千川", "要町", "池袋", "東池袋",
			"護国寺", "江戸川橋", "飯田橋", "市ヶ谷", "麹町", "永田町", "桜田門", "有楽町", "銀座一丁目", "新富町",
			"月島", "豊洲", "辰巳", "新木場"};
	final static String[] LN_ST_LIST_TOBU_TOJO= {"池袋", "北池袋", "下板橋", "大山", "中板橋", "ときわ台", "上板橋", "東武練馬", "下赤塚", "成増",
			"和光市", "朝霞", "朝霞台", "志木", "柳瀬川", "みずほ台", "鶴瀬", "ふじみ野", "上福岡", "新河岸",
			"川越", "川越市", "霞ヶ関", "鶴ヶ島", "若葉", "坂戸", "北坂戸", "高坂", "東松山", "森林公園",
			"つきのわ", "武蔵嵐山", "小川町", "東武竹沢", "みなみ寄居[ホンダ寄居前]", "男衾", "鉢形", "玉淀", "寄居"};
	final static String[] LN_ST_LIST_TOHOKU_SHINKANSEN= {"東京", "上野", "大宮", "小山", "宇都宮", "那須塩原", "新白河", "郡山", "福島", "白石蔵王",
			"仙台", "古川", "くりこま高原", "一ノ関", "水沢江刺", "北上", "新花巻", "盛岡", "いわて沼宮内", "二戸",
			"八戸", "七戸十和田", "新青森"};
	final static String[] LN_ST_LIST_TOHOKU_HONSEN= {"東京", "上野", "尾久", "赤羽", "浦和", "さいたま新都心", "大宮", "土呂", "東大宮", "蓮田",
			"白岡", "新白岡", "久喜", "東鷲宮", "栗橋", "古河", "野木", "間々田", "小山", "小金井",
			"自治医大", "石橋", "雀宮", "宇都宮", "岡本", "宝積寺", "氏家", "蒲須坂", "片岡", "矢板",
			"野崎", "西那須野", "那須塩原", "黒磯"};
	final static String[] LN_ST_LIST_HOKURIKU_SHINKANSEN= {"東京", "上野", "大宮", "熊谷", "本庄早稲田", "高崎", "安中榛名", "軽井沢", "佐久平", "上田",
			"長野", "飯山", "上越妙高", "糸魚川", "黒部宇奈月温泉", "富山", "新高岡", "金沢", "小松", "加賀温泉",
			"芦原温泉", "福井", "越前たけふ", "敦賀"};

	//  各路線の上り下りの駅数(路線名, 方面1, 方面1への駅数(, 方面2, 方面2への駅数）)
	//  東京駅
//	final static String[] ST_TOKYO_TOKAIDO_HONSENN = {TOKAIDO_HONSEN, "熱海", "20"};
//	final static String[] ST_TOKYO_YAMANOTE = {YAMANOTE, "大崎", "23", "品川", "6"};
//	final static String[] ST_TOKYO_KEIHIN_TOHOKU = {KEIHIN_TOHOKU, "大宮", "21", "横浜", "14"};
//	final static String[] ST_TOKYO_YOKOSUKA = {YOKOSUKA, "久里浜", "18"};
//	final static String[] ST_TOKYO_SOBU_HONSEN = {SOBU_HONSEN, "銚子", "30"};
//	final static String[] ST_TOKYO_KEIO = {KEIO, "蘇我", "17"};
//	final static String[] ST_TOKYO_CHUO = {CHUO, "高尾", "23"};
//	final static String[] ST_TOKYO_CHUO_HONSEN = {CHUO_HONSEN, "松本", "50"};
//	final static String[] ST_TOKYO_UENO_TOKYO = {UENO_TOKYO, "上野", "1"};
//	final static String[] ST_TOKYO_TOHOKU_SHINKANSEN = {TOHOKU_SHINKANSEN, "新青森", "22"};
//	final static String[] ST_TOKYO_JOETSU_SHINKANSEN = {JOETSU_SHINKANSEN, "新潟", "11"};
//	final static String[] ST_TOKYO_HOKURIKU_SHINKANSEN = {HOKURIKU_SHINKANSEN, "上越妙高", "12"};
//	final static String[] ST_TOKYO_TOKAIDO_SHINKANSEN = {TOKAIDO_SHINKANSEN, "新大阪", "16"};
//	final static String[] ST_TOKYO_TOKYO_METRO_MARUNOUCHI = {TOKYO_METRO_MARUNOUCHI, "大宮", "21", "横浜", "14"};
	final static String[] ST_TOKYO_YOKOSUKA = {YOKOSUKA , "久里浜", "17"};
	final static String[] ST_TOKYO_KEIHIN_TOHOKU = {KEIHIN_TOHOKU, "大宮", "21", "横浜", "14"};
	final static String[] ST_TOKYO_KEIYO = {KEIYO, "蘇我", "17"};
	final static String[] ST_TOKYO_YAMANOTE = {YAMANOTE, "大崎", "23", "品川", "6"};
	final static String[] ST_TOKYO_JOETSU_SHINKANSEN = {JOETSU_SHINKANSEN, "新潟", "11"};
	final static String[] ST_TOKYO_UENO_TOKYO = {UENO_TOKYO, "黒磯", "33"};
	final static String[] ST_TOKYO_SOBU_HONSEN = {SOBU_HONSEN, "銚子", "41"};
	final static String[] ST_TOKYO_CHUO_HONSEN = {CHUO_HONSEN, "塩尻", "68"};
	final static String[] ST_TOKYO_TOKAIDO_SHINKANSEN = {TOKAIDO_SHINKANSEN, "新大阪", "16"};
	final static String[] ST_TOKYO_TOKAIDO_HONSEN = {TOKAIDO_HONSEN, "熱海", "20"};
	final static String[] ST_TOKYO_TOHOKU_SHINKANSEN = {TOHOKU_SHINKANSEN, "新青森", "22"};
	final static String[] ST_TOKYO_TOHOKU_HONSEN = {TOHOKU_HONSEN, "黒磯", "33"};
	final static String[] ST_TOKYO_HOKURIKU_SHINKANSEN = {HOKURIKU_SHINKANSEN, "敦賀", "23"};

	//  上野
//	final static String[] ST_UENO_YAMANOTE = {YAMANOTE, "大崎", "19", "品川", "10"};
//	final static String[] ST_UENO_KEIHIN_TOHOKU = {KEIHIN_TOHOKU, "大宮", "17", "横浜", "18"};
//	final static String[] ST_UENO_TOHOKU_HONSEN = {TOHOKU_HONSEN, "盛岡", "114"};
//	final static String[] ST_UENO_JOBAN = {JOBAN, "仙台", "77"};
//	final static String[] ST_UENO_TAKASAKI = {TAKASAKI, "高崎", "23"};
//	final static String[] ST_UENO_UENO_TOKYO = {UENO_TOKYO, "東京", "1"};
//	final static String[] ST_UENO_TOHOKU_SHINKANSEN = {TOHOKU_SHINKANSEN, "新青森", "21"};
//	final static String[] ST_UENO_JOETSU_SHINKANSEN = {JOETSU_SHINKANSEN, "新潟", "10"};
//	final static String[] ST_UENO_HOKURIKU_SHINKANSEN = {HOKURIKU_SHINKANSEN, "上越妙高", "11"};
//	final static String[] ST_UENO_TOKYO_METRO_GINZA = {TOKYO_METRO_GINZA, "浅草", "3", "渋谷", "15"};
//	final static String[] ST_UENO_TOKYO_METRO_HIBIYA = {TOKYO_METRO_HIBIYA, "北千住", "4", "中目黒", "17"};
	final static String[] ST_UENO_KEIHIN_TOHOKU = {KEIHIN_TOHOKU, "大宮", "17", "横浜", "18"};
	final static String[] ST_UENO_YAMANOTE = {YAMANOTE, "大崎", "19", "品川", "10"};
	final static String[] ST_UENO_JOETSU_SHINKANSEN = {JOETSU_SHINKANSEN, "新潟", "10"};
	final static String[] ST_UENO_UENO_TOKYO = {UENO_TOKYO, "黒磯", "32"};
	final static String[] ST_UENO_JOBAN = {JOBAN, "岩沼", "80"};
	final static String[] ST_UENO_TOKYO_METRO_GINZA = {TOKYO_METRO_GINZA, "浅草", "3", "渋谷", "15"};
	final static String[] ST_UENO_TOKYO_METRO_HIBIYA = {TOKYO_METRO_HIBIYA, "北千住", "4", "中目黒", "17"};
	final static String[] ST_UENO_TOHOKU_SHINKANSEN = {TOHOKU_SHINKANSEN, "新青森", "21"};
	final static String[] ST_UENO_TOHOKU_HONSEN = {TOHOKU_HONSEN, "東京", "1", "黒磯", "32"};
	final static String[] ST_UENO_HOKURIKU_SHINKANSEN = {HOKURIKU_SHINKANSEN, "敦賀", "22"};

	//  池袋
//	final static String[] ST_IKEBUKURO_YAMANOTE = {YAMANOTE, "大崎", "11", "品川", "18"};
//	final static String[] ST_IKEBUKURO_SAIKYO = {SAIKYO, "大崎", "4", "大宮", "14"};
//	final static String[] ST_IKEBUKURO_SHONAN_SHINJUKU_TAKASAKI_ODAWARA = {SHONAN_SHINJUKU_TAKASAKI_ODAWARA, "高崎", "21", "小田原", "21"};
//	final static String[] ST_IKEBUKURO_SHONAN_SHINJUKU_UTSUNOMIYA_ZUSHI = {SHONAN_SHINJUKU_UTSUNOMIYA_ZUSHI, "宇都宮", "20", "逗子", "15"};
//	final static String[] ST_IKEBUKURO_TOKYO_METRO_MARUNOUCHI = {TOKYO_METRO_MARUNOUCHI, "荻窪", "24"};
//	final static String[] ST_IKEBUKURO_TOKYO_METRO_YURAKUCHO = {TOKYO_METRO_YURAKUCHO, "和光市", "8"};
//	final static String[] ST_IKEBUKURO_TOKYO_METRO_FUKUTOSHIN = {TOKYO_METRO_FUKUTOSHIN, "和光市", "8", "渋谷", "7"};
//	final static String[] ST_IKEBUKURO_SEIBU_IKEBUKURO = {SEIBU_IKEBUKURO, "吾野", "30"};
//	final static String[] ST_IKEBUKURO_TOBU_TOJO = {TOBU_TOJO, "寄居", "38"};
	final static String[] ST_IKEBUKURO_SAIKYO = {SAIKYO, "大崎", "4", "大宮", "14"};
	final static String[] ST_IKEBUKURO_YAMANOTE = {YAMANOTE, "大崎", "11", "品川", "18"};
	final static String[] ST_IKEBUKURO_SHONAN_SHINJUKU = {SHONAN_SHINJUKU, "西大井", "5", "赤羽", "1"};
	final static String[] ST_IKEBUKURO_SEIBU_IKEBUKURO = {SEIBU_IKEBUKURO, "飯能", "25"};
	final static String[] ST_IKEBUKURO_TOKYO_METRO_MARUNOUCHI = {TOKYO_METRO_MARUNOUCHI, "荻窪", "23"};
	final static String[] ST_IKEBUKURO_TOKYO_METRO_FUKUTOSHIN = {TOKYO_METRO_FUKUTOSHIN, "小竹向原", "3", "渋谷", "7"};
	final static String[] ST_IKEBUKURO_TOKYO_METRO_YURAKUCHO = {TOKYO_METRO_YURAKUCHO, "和光市", "8", "新木場", "15"};
	final static String[] ST_IKEBUKURO_TOBU_TOJO = {TOBU_TOJO, "寄居", "38"};

	//  新宿
//	final static String[] ST_SHINJUKU_YAMANOTE = {YAMANOTE, "大崎", "7", "品川", "22"};
//	final static String[] ST_SHINJUKU_SOBU = {SOBU, "千葉", "29", "三鷹", "9"};
//	final static String[] ST_SHINJUKU_SAIKYO = {SAIKYO, "大崎", "3", "大宮", "15"};
//	final static String[] ST_SHINJUKU_CHUO = {CHUO, "東京", "4", "高尾", "19"};
//	final static String[] ST_SHINJUKU_CHUO_HONSEN = {CHUO_HONSEN, "東京", "1", "松本", "49"};
//	final static String[] ST_SHINJUKU_SHONAN_SHINJUKU_TAKASAKI_ODAWARA = {SHONAN_SHINJUKU_TAKASAKI_ODAWARA, "高崎", "21", "小田原", "20"};
//	final static String[] ST_SHINJUKU_SHONAN_SHINJUKU_UTSUNOMIYA_ZUSHI = {SHONAN_SHINJUKU_UTSUNOMIYA_ZUSHI, "宇都宮", "21", "逗子", "14"};
//	final static String[] ST_SHINJUKU_TOEI_SHINJUKU = {TOEI_SHINJUKU, "本八幡", "20"};
//	final static String[] ST_SHINJUKU_TOEI_OHEDO = {TOEI_OHEDO, "都庁前", "27", "光が丘", "10"};
//	final static String[] ST_SHINJUKU_KEIO = {KEIO, "京王八王子", "31"};
//	final static String[] ST_SHINJUKU_KEIO_SHINSEN = {KEIO_SHINSEN, "笹塚", "3"};
//	final static String[] ST_SHINJUKU_ODAKYU_ODAWARA = {ODAKYU_ODAWARA, "小田原", "46"};
	final static String[] ST_SHINJUKU_KEIO_SHINSEN = {KEIO_SHINSEN, "笹塚", "3"};
	final static String[] ST_SHINJUKU_KEIO = {KEIO, "京王八王子", "31"};
	final static String[] ST_SHINJUKU_SAIKYO = {SAIKYO, "大崎", "3", "大宮", "15"};
	final static String[] ST_SHINJUKU_YAMANOTE = {YAMANOTE, "大崎", "7", "品川", "22"};
	final static String[] ST_SHINJUKU_ODAKYU_ODAWARA = {ODAKYU_ODAWARA, "小田原", "46"};
	final static String[] ST_SHINJUKU_SHONAN_SHINJUKU = {SHONAN_SHINJUKU, "西大井", "4", "赤羽", "2"};
	final static String[] ST_SHINJUKU_CHUO_HONSEN = {CHUO_HONSEN, "東京", "10", "塩尻", "58"};
	final static String[] ST_SHINJUKU_TOEI_SHINJUKU = {TOEI_SHINJUKU, "本八幡", "20"};
	final static String[] ST_SHINJUKU_TOEI_OHEDO = {TOEI_OHEDO, "光が丘", "11", "都庁前", "27"};
	final static String[] ST_SHINJUKU_TOKYO_METRO_MARUNOUCHI = {TOKYO_METRO_MARUNOUCHI, "池袋", "16", "荻窪", "7"};

	//  渋谷
//	final static String[] ST_SHIBUYA_YAMANOTE = {YAMANOTE, "大崎", "4", "品川", "25"};
//	final static String[] ST_SHIBUYA_SAIKYO = {SAIKYO, "大崎", "2", "大宮", "16"};
//	final static String[] ST_SHIBUYA_SHONAN_SHINJUKU_TAKASAKI_ODAWARA = {SHONAN_SHINJUKU_TAKASAKI_ODAWARA, "高崎", "22", "小田原", "19"};
//	final static String[] ST_SHIBUYA_SHONAN_SHINJUKU_UTSUNOMIYA_ZUSHI = {SHONAN_SHINJUKU_UTSUNOMIYA_ZUSHI, "宇都宮", "22", "逗子", "13"};
//	final static String[] ST_SHIBJYA_TOKYO_METRO_GINA = {TOKYO_METRO_GINZA, "浅草", "18"};
//	final static String[] ST_SHIBJYA_TOKYO_METRO_HANZOMON = {TOKYO_METRO_HANZOMON, "押上", "13"};
//	final static String[] ST_SHIBJYA_TOKYO_METRO_FUKUTOSHIN = {TOKYO_METRO_FUKUTOSHIN, "和光市", "15"};
//	final static String[] ST_SHIBUYA_KEIO_INOKASHIRA = {KEIO_INOKASHIRA, "吉祥寺", "16"};
//	final static String[] ST_SHIBUYA_TOKYU_TOYOKO = {TOKYU_TOYOKO, "横浜", "20"};
//	final static String[] ST_SHIBUYA_TOKYU_DENENTOSHI = {TOKYU_DENENTOSHI, "中央林間", "26"};
	final static String[] ST_SHIBUYA_KEIO_INOKASHIRA = {KEIO_INOKASHIRA, "吉祥寺", "15"};
	final static String[] ST_SHIBUYA_SAIKYO = {SAIKYO, "大崎", "2", "大宮", "16"};
	final static String[] ST_SHIBUYA_YAMANOTE = {YAMANOTE, "大崎", "4", "品川", "25"};
	final static String[] ST_SHIBUYA_SHONAN_SHINJUKU = {SHONAN_SHINJUKU, "西大井", "3", "赤羽", "3"};
	final static String[] ST_SHIBUYA_TOKYU_DENENTOSHI = {TOKYU_DENENTOSHI, "中央林間", "26"};
	final static String[] ST_SHIBUYA_TOKYU_TOYOKO = {TOKYU_TOYOKO, "横浜", "20"};
	final static String[] ST_SHIBUYA_TOKYO_METRO_GINZA = {TOKYO_METRO_GINZA, "浅草", "18"};
	final static String[] ST_SHIBUYA_TOKYO_METRO_HANZOMON = {TOKYO_METRO_HANZOMON, "押上[スカイツリー前]", "13"};
	final static String[] ST_SHIBUYA_TOKYO_METRO_FUKUTOSHIN = {TOKYO_METRO_FUKUTOSHIN, "小竹向原", "10"};

	//  品川
//	final static String[] ST_SHINAGAWA_TOKAIDO_HONSEN = {TOKAIDO_HONSEN, "東京", "2", "熱海", "18"};
//	final static String[] ST_SHINAGAWA_YAMANOTE = {YAMANOTE, "大崎", "29"};
//	final static String[] ST_SHINAGAWA_KEIHIN_TOHOKU = {KEIHIN_TOHOKU, "大宮", "27", "横浜", "8"};
//	final static String[] ST_SHINAGAWA_YOKOSUKA = {YOKOSUKA, "東京", "2", "久里浜", "16"};
//	final static String[] ST_SHINAGAWA_TOKAIDO_SHINKANSEN = {TOKAIDO_SHINKANSEN, "新大阪", "15"};
//	final static String[] ST_SHINAGAWA_KEIKYU_HONSEN = {KEKYU_HONSEN, "泉岳寺", "1", "浦賀", "48"};
	final static String[] ST_SHINAGAWA_YOKOSUKA = {YOKOSUKA , "東京", "2", "久里浜", "15"};
	final static String[] ST_SHINAGAWA_KEKYU_HONSEN = {KEKYU_HONSEN, "泉岳寺", "1", "浦賀", "48"};
	final static String[] ST_SHINAGAWA_KEIHIN_TOHOKU = {KEIHIN_TOHOKU, "大宮", "27", "横浜", "8"};
	final static String[] ST_SHINAGAWA_YAMANOTE = {YAMANOTE, "大崎", "29"};
	final static String[] ST_SHINAGAWA_TOKAIDO_SHINKANSEN = {TOKAIDO_SHINKANSEN, "新大阪", "15"};
	final static String[] ST_SHINAGAWA_TOKAIDO_HONSEN = {TOKAIDO_HONSEN, "東京", "2", "熱海", "18"};

	//  やること
	final static String[] TODO_LIST = {"やりたい放題してください！", "駅周辺を散策してください！", "お昼ごはんを食べてください！", "カフェタイムにしましょう！"};

}
