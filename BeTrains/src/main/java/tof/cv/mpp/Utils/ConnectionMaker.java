package tof.cv.mpp.Utils;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.Html;

import java.util.List;

/*
 * 
 * THIS IS GARBAGE AND WILL BE CLEANED/DELETED SOON!!!!!!
 * 
 */

public class ConnectionMaker {

	public final static String[] LIST_OF_EURO_STATIONS = new String[] {
			"FR/LILLE", "FR/PARIS", "FR/STRASBOURG", "DE/AACHEN HBF",
			"DE/KOLN HBF", "LU/LUXEMBOURG", "NL/DEN HAAG", "NL/AMSTERDAM",
			"NL/MAASTRICHT", "NL/ROTTERDAM" };

	public final static String[] LIST_OF_FAV_STATIONS = new String[] { "FAV1",
			"FAV2", "FAV3", "FAV4", "FAV5" };

	public final static String[] LIST_OF_STATIONS = new String[] {
			"'S GRAVENBRAKEL", "AALST", "AALST KERREBROEK", "AALTER", "AARLEN",
			"AARSCHOT", "AARSELE", "AAT", "ACREN", "AISEAU", "ALKEN", "ALOST",
			"AMAY", "AMPSIN", "ANDENNE", "ANGLEUR", "ANS", "ANSEREMME",
			"ANTOING", "ANTWERPEN BERCHEM", "ANTWERPEN CENTRAAL",
			"ANTWERPEN DAM", "ANTWERPEN HAVEN", "ANTWERPEN LUCHTBAL",
			"ANTWERPEN NOORDERDOKKEN", "ANTWERPEN OOST", "ANTWERPEN ZUID",
			"ANVERS BERCHEM", "ANVERS CENTRAL", "ANVERS DAM", "ANVERS EST",
			"ANVERS HAVEN", "ANVERS LUCHTBAL", "ANVERS NOORDERDOKKEN",
			"ANVERS SUD", "ANZEGEM", "APPELTERRE", "ARCHENNES", "ARLON",
			"ASSE", "ASSESSE", "ATH", "ATHUS", "AUBANGE", "AUDENARDE",
			"AUVELAIS", "AYE", "AYWAILLE", "BAASRODE SUD", "BAASRODE ZUID",
			"BALEGEM DORP", "BALEGEM SUD", "BALEGEM VILLAGE", "BALEGEM ZUID",
			"BALEN", "BAMBRUGGE", "BARVAUX", "BAS OHA", "BASSE WAVRE",
			"BASTENAKEN NOORD", "BASTENAKEN ZUID", "BASTOGNE NORD",
			"BASTOGNE SUD", "BEAURAING", "BEERNEM", "BEERSEL", "BEERVELDE",
			"BEGIJNENDIJK", "BEIGNEE", "BELLEM", "BELSELE",
			"BERCHEM SAINTE AGATHE", "BERGEN", "BERINGEN", "BERLAAR",
			"BERTRIX", "BERZEE", "BEUZET", "BEVEREN(WAAS)", "BEVEREN(WAES)",
			"BIERGES WALIBI", "BIERSET AWANS", "BILZEN", "BINCHE", "BISSEGEM",
			"BLANKENBERGE", "BLANMONT", "BLATON", "BLERET", "BOCKSTAEL",
			"BOECHOUT", "BOITSFORT", "BOKRIJK", "BOMAL", "BOOISCHOT", "BOOM",
			"BOONDAAL", "BOONDAEL", "BOORTMEERBEEK", "BORDET", "BORGWORM",
			"BORNEM", "BOSVOORDE", "BOURG LEOPOLD", "BOUSSU", "BOUWEL",
			"BRACQUEGNIES", "BRAINE L'ALLEUD", "BRAINE LE COMTE", "BRESSOUX",
			"BRUGELETTE", "BRUGES", "BRUGES SAINT PIERRE", "BRUGGE",
			"BRUGGE SINT PIETERS", "BRUSSEL CENTRAAL", "BRUSSEL CONGRES",
			"BRUSSEL KAPELLEKERK", "BRUSSEL LUXEMBURG",
			"BRUSSEL NAT LUCHTHAVEN", "BRUSSEL NOORD", "BRUSSEL SCHUMAN",
			"BRUSSEL ZUID", "BRUXELLES CENTRAL", "BRUXELLES CHAPELLE",
			"BRUXELLES CONGRES", "BRUXELLES LUXEMBOURG", "BRUXELLES MIDI",
			"BRUXELLES NAT AEROPORT", "BRUXELLES NORD", "BRUXELLES SCHUMAN",
			"BUDA", "BUGGENHOUT", "BUIZINGEN", "BURST", "CALLENELLE",
			"CAMBRON CASTEAU", "CARLSBOURG", "CARNIERES", "CEROUX MOUSTY",
			"CHAPELLE DIEU", "CHAPOIS", "CHARLEROI OUEST", "CHARLEROI SUD",
			"CHARLEROI WEST", "CHARLEROI ZUID", "CHASTRE",
			"CHATEAU DE SEILLES", "CHATELET", "CHENEE", "CINEY",
			"COMBLAIN LA TOUR", "COMINES", "COO", "COUILLET",
			"COURCELLES MOTTE", "COURRIERE", "COUR SUR HEURE", "COURTRAI",
			"COURT SAINT ETIENNE", "COUVIN", "DAVE SAINT MARTIN", "DE HOEK",
			"DE PANNE", "DE PINTE", "DEINZE", "DELTA", "DENDERLEEUW",
			"DENDERMONDE", "DIEGEM", "DIEPENBEEK", "DIESDELLE", "DIEST",
			"DIKSMUIDE", "DILBEEK", "DINANT", "DIXMUDE", "DOLHAIN GILEPPE",
			"DOORNIK", "DRONGEN", "DUFFEL", "DUINBERGEN", "ECAUSSINNES", "EDE",
			"EDINGEN", "EEKLO", "EERKEN", "EICHEM", "EIGENBRAKEL", "EINE",
			"EKE NAZARETH", "EKEREN", "ENGHIEN", "ENGIS", "EPPEGEM",
			"ERBISOEUL", "EREMBODEGEM", "ERNAGE", "ERPE MERE", "ERPS KWERPS",
			"ERQUELINNES", "ERQUELINNES DORP", "ERQUELINNES VILLAGE", "ESNEUX",
			"ESSEN", "ESSENE LOMBEEK", "ETTERBEEK", "EUPEN", "EVERE",
			"EVERGEM", "EZEMAAL", "FAMILLEUREUX", "FARCIENNES", "FAUX",
			"FEXHE LE HAUT CLOCHER", "FLAWINNE", "FLEMALLE GRANDE",
			"FLEMALLE HAUTE", "FLEURUS", "FLOREE", "FLOREFFE", "FLORENVILLE",
			"FLORIVAL", "FONTAINE VALMONT", "FORCHIES", "FOREST EST",
			"FOREST MIDI", "FORRIERES", "FRAIPONT", "FRAMERIES", "FRANCHIMONT",
			"FRANIERE", "FROYENNES", "FURNES", "GALMAARDEN", "GAMMERAGES",
			"GAND DAMPOORT", "GAND SAINT PIERRE", "GASTUCHE", "GAVERE ASPER",
			"GEDINNE", "GEEL", "GEMBLOUX", "GENDRON CELLES", "GENK", "GENLY",
			"GENTBRUGGE", "GENT DAMPOORT", "GENT SINT PIETERS", "GENVAL",
			"GERAARDSBERGEN", "GHLIN", "GLAAIEN", "GLONS", "GODARVILLE",
			"GODINNE", "GONTRODE", "GOUVY", "GOUY LEZ PIETON", "GRAIDE",
			"GRAMMONT", "GROENENDAAL", "GROOT BIJGAARDEN", "GRUPONT", "HAACHT",
			"HAALTERT", "HABAY", "HAININ", "HAL", "HALANZY", "HALLE", "HAMBOS",
			"HAMOIR", "HAM SUR HEURE", "HAM SUR SAMBRE", "HANSBEKE",
			"HARCHIES", "HARELBEKE", "HAREN", "HAREN SUD", "HAREN ZUID",
			"HASSELT", "HAUTE FLâNE", "HAVERSIN", "HAVRE", "HEIDE", "HEIST",
			"HEIST OP DEN BERG", "HEIZIJDE", "HEMIKSEM", "HENNUYERES",
			"HERENT", "HERENTALS", "HERGENRATH", "HERNE", "HERSEAUX",
			"HERSTAL", "HERZELE", "HEUSDEN", "HEVER", "HEVERLEE", "HILLEGEM",
			"HOBOKEN POLDER", "HOEI", "HOEILAART", "HOFSTADE", "HOLLEKEN",
			"HONY", "HOURAING", "HOURPES", "HOUYET", "HOVE", "HUIZINGEN",
			"HUY", "IDDERGEM", "IDEGEM", "IEPER", "INGELMUNSTER", "IZEGEM",
			"JAMBES", "JAMBES EST", "JAMBES OOST", "JAMIOULX", "JEMAPPES",
			"JEMELLE", "JEMEPPE SUR MEUSE", "JEMEPPE SUR SAMBRE", "JETTE",
			"JURBEKE", "JURBISE", "JUSLENVILLE", "KALMTHOUT", "KAPELLEN",
			"KAPELLE OP DEN BOS", "KESSEL", "KIEWIT", "KIJKUIT", "KNOKKE",
			"KOKSIJDE", "KOMEN", "KONTICH", "KORTEMARK", "KORTENBERG",
			"KORTRIJK", "KWATRECHT", "LA HULPE", "LA LOUVIERE CENTRE",
			"LA LOUVIERE CENTRUM", "LA LOUVIERE SUD", "LA LOUVIERE ZUID",
			"LA PANNE", "LA ROCHE(BRABANT)", "LABUISSIERE", "LANDEGEM",
			"LANDELIES", "LANDEN", "LANDSKOUTER", "LANGDORP", "LE CAMPINAIRE",
			"LEBBEKE", "LEDE", "LEIGNON", "LEMAN", "LEMBEEK", "LENS",
			"LEOPOLDSBURG", "LESSEN", "LESSINES", "LEUVEN", "LEUZE", "LEVAL",
			"LIBRAMONT", "LICHTERVELDE", "LIEDEKERKE", "LIEGE GUILLEMINS",
			"LIEGE JONFOSSE", "LIEGE PALAIS", "LIER", "LIERDE", "LIERRE",
			"LIERS", "LIGNY", "LILLOIS", "LIMAL", "LINKEBEEK", "LISSEWEGE",
			"LOBBES", "LODELINSART", "LOKEREN", "LOMMEL", "LONDERZEEL",
			"LONZEE", "LOT", "LOUVAIN", "LOUVAIN LA NEUVE UNIVERSITE",
			"LOUVAIN LA NEUVE UNIVERSITEIT", "LUIK GUILLEMINS",
			"LUIK JONFOSSE", "LUIK PALEIS", "LUSTIN", "LUTTRE", "MAFFLE",
			"MALDEREN", "MALINES", "MALINES NEKKERSPOEL", "MANAGE", "MARBEHAN",
			"MARCHE EN FAMENNE", "MARCHE LES DAMES", "MARCHE LEZ ECAUSSINNES",
			"MARCHIENNE AU PONT", "MARCHIENNE ZONE", "MARIA AALTER",
			"MARIEMBOURG", "MARLOIE", "MASNUY SAINT PIERRE", "MAUBRAY", "MAZY",
			"MECHELEN", "MECHELEN NEKKERSPOEL", "MEISER", "MELKOUWEN", "MELLE",
			"MELREUX HOTTON", "MELSELE", "MENEN", "MENIN", "MERCHTEM",
			"MERELBEKE", "MERODE", "MERY", "MESSANCY", "MEVERGNIES ATTRE",
			"MILMORT", "MOENSBERG", "MOESKROEN", "MOL", "MOLLEM", "MOMALLE",
			"MONS", "MONT SAINT GUIBERT", "MOORTSELE", "MORLANWELZ", "MORTSEL",
			"MORTSEL DEURNESTEENWEG", "MORTSEL LIERSESTEENWEG",
			"MORTSEL OUDE GOD", "MOUSCRON", "MOUSTIER", "MUIZEN", "MUNKZWALM",
			"NAMECHE", "NAMEN", "NAMUR", "NANINNE", "NATOYE", "NEERPELT",
			"NEERWINDEN", "NESSONVAUX", "NEUFCHATEAU", "NEUFVILLES", "NIEL",
			"NIEUWKERKEN WAAS", "NIJLEN", "NIJVEL", "NIMY", "NINOVE",
			"NIVELLES", "NOORDERKEMPEN", "NOSSEGEM", "OBAIX BUZET", "OBOURG",
			"OKEGEM", "OLEN", "OOSTENDE", "OOSTKAMP", "OPWIJK", "OPZULLIK",
			"OSTENDE", "OTTIGNIES", "OUDEGEM", "OUDENAARDE", "OUD HEVERLEE",
			"OVERPELT", "PALISEUL", "PAPEGEM", "PAPIGNIES", "PECROT",
			"PEPINSTER", "PEPINSTER CITE", "PERUWELZ", "PHILIPPEVILLE",
			"PIETON", "POIX SAINT HUBERT", "PONT · CELLES", "PONT DE SERAING",
			"POPERINGE", "POULSEUR", "PROFONDSART", "PRY", "PUURS",
			"QUAREGNON", "QUEVY", "QUIEVRAIN", "REBAIX", "REMICOURT", "RENAIX",
			"RHISNES", "RHODE SAINT GENESE", "RIVAGE", "RIXENSART",
			"ROESELARE", "RONET", "RONSE", "ROULERS", "ROUX", "RUISBROEK",
			"RUISBROEK SAUVEGARDE", "SAINT DENIS BOVESSE", "SAINT GHISLAIN",
			"SAINT JOB", "SAINT NICOLAS", "SAINT TROND", "SART BERNARD",
			"SCHAARBEEK", "SCHAERBEEK", "SCHELDEWINDEKE", "SCHELLE",
			"SCHELLEBELLE", "SCHENDELBEKE", "SCHOONAARDE", "SCHULEN",
			"SCLAIGNEAUX", "SCLESSIN", "SERSKAMP", "'S GRAVENBRAKEL", "SILLY",
			"SINAAI", "SINT AGATHA BERCHEM", "SINT DENIJS BOEKEL",
			"SINT GENESIUS RODE", "SINT GILLIS", "SINT GILLIS(TERMONDE)",
			"SINT JOB", "SINT JORIS WEERT", "SINT KATELIJNE WAVER",
			"SINT MARIABURG", "SINT MARTENS BODEGEM", "SINT NIKLAAS",
			"SINT TRUIDEN", "SLEIDINGE", "SOIGNIES", "SOLRE SUR SAMBRE", "SPA",
			"SPA GERONSTERE", "STATTE", "STOCKEM", "SY", "TAMINES", "TAMISE",
			"TEMSE", "TERHAGEN", "TERHULPEN", "TERMONDE", "TERNAT", "TESTELT",
			"THEUX", "THIEU", "THUIN", "THULIN", "TIELEN", "TIELT", "TIENEN",
			"TILFF", "TILLY", "TIRLEMONT", "TOLLEMBEEK", "TONGEREN", "TONGRES",
			"TORHOUT", "TOURNAI", "TROIS PONTS", "TRONCHIENNES", "TROOZ",
			"TUBEKE", "TUBIZE", "TURNHOUT", "UCCLE CALEVOET", "UCCLE STALLE",
			"UKKEL KALEVOET", "UKKEL STALLE", "VELTEM", "VERTRIJK",
			"VERVIERS CENTRAAL", "VERVIERS CENTRAL", "VERVIERS PALAIS",
			"VERVIERS PALEIS", "VEURNE", "VIANE MOERBEKE", "VICHTE",
			"VIELSALM", "VIJFHUIZEN", "VILLE POMMEROEUL", "VILLERS LA VILLE",
			"VILVOORDE", "VILVORDE", "VIRTON", "VISE", "VIVIER D'OIE",
			"VIVILLE", "VOROUX", "VORST OOST", "VORST ZUID", "WAARSCHOOT",
			"WALCOURT", "WAREGEM", "WAREMME", "WATERLOO", "WATERMAAL",
			"WATERMAEL", "WAVER", "WAVRE", "WEERDE", "WELKENRAEDT", "WELLE",
			"WERVIK", "WESPELAAR TILDONK", "WETTEREN", "WEVELGEM", "WEZEMAAL",
			"WEZET", "WICHELEN", "WIJGMAAL", "WILDERT", "WILLEBROEK",
			"WOLFSTEE", "WONDELGEM", "YPRES", "YVES GOMEZEE", "YVOIR",
			"ZANDBERGEN", "ZAVENTEM", "ZEDELGEM", "ZEEBRUGGE DORP",
			"ZEEBRUGGE STRAND", "ZELE", "ZELLIK", "ZICHEM", "ZINGEM", "ZINNIK",
			"ZOLDER", "ZOTTEGEM", "ZWANKENDAMME", "ZWIJNDRECHT" };

	/*
	 * public static void fillDate(Activity context, String pYear, String
	 * pMonth, String pDay) { final TextView textYear = (TextView)
	 * context.findViewById(R.id.tv_year); final TextView textMonth = (TextView)
	 * context .findViewById(R.id.tv_month); final TextView textDay = (TextView)
	 * context.findViewById(R.id.tv_day); textYear.setText(fillZero(pYear));
	 * textMonth.setText(fillZero(pMonth)); textDay.setText(fillZero(pDay)); }
	 * 
	 * public static void fillTime(Activity context, String pHour, String
	 * pMinute) { final TextView textHour = (TextView)
	 * context.findViewById(R.id.tv_hour); final TextView textMinute =
	 * (TextView) context .findViewById(R.id.tv_minut);
	 * textHour.setText(fillZero(pHour)); textMinute.setText(fillZero(pMinute));
	 * }
	 */

	public static void createAlertDialog(String title, String body,
			Context context) {

		AlertDialog.Builder alt_bld = new AlertDialog.Builder(context);
		alt_bld.setMessage(body)
				.setCancelable(false)
				.setPositiveButton(android.R.string.ok,
						new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog, int id) {
								// Action for 'Yes' Button
							}
						});
		AlertDialog alert = alt_bld.create();
		alert.setTitle(title);
		alert.show();
	}

	public static void createAlertDialogAndFinish(String title, String body,
			final Context context) {

		AlertDialog.Builder alt_bld = new AlertDialog.Builder(context);
		alt_bld.setMessage(body)
				.setCancelable(false)
				.setPositiveButton(android.R.string.ok,
						new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog, int id) {
								// Action for 'Yes' Button
								((Activity) context).finish();
							}
						});
		AlertDialog alert = alt_bld.create();
		alert.setTitle(title);
		alert.show();
	}

	public static void addAsStarred(String item, String item2, int type,
			Context context) {
		DbAdapterConnection mDbHelper = new DbAdapterConnection(context);
		mDbHelper.open();
		mDbHelper.createFav(item, item2, type);
		mDbHelper.close();

	}
	public static String capitalize(String inputWord) {
		String firstLetter = inputWord.substring(0, 1); // Get first letter
		String remainder = inputWord.substring(1); // Get remainder of word.
		return firstLetter.toUpperCase() + remainder.toLowerCase();

	}

	public static String correctHTML(String bla)

	{
		return Html.fromHtml(bla).toString();
	}

	public class Liveboard {

		private Departures departures;
		private String station;
		private StationInfo stationinfo;

		public Departures getDepartures() {
			return departures;
		}

		public String getName() {
			return station;
		}

		public StationInfo getStationInfo() {
			return stationinfo;
		}

	}

	public class Departures {

		private List<Departure> departure;

		public List<Departure> getDepartures() {
			return departure;
		}

	}

	public class StationInfo {

		private String locationX;
		private String locationY;

		public String getLat() {
			return locationX;
		}

		public String getLon() {
			return locationY;
		}

	}

	public class Departure {
		public String vehicle;
		private String station;
		public String platform;
		private String time;
		private String delay;
		private double locationX;
		private double locationY;

		public Departure(String vehicle, String station, String delay,
				double locationX, double locationY) {
			this.vehicle = vehicle;
			this.station = station;
			this.delay = delay;
			this.locationX = locationX;
			this.locationY = locationY;
		}

		public String getName() {
			return this.station;
		}

		public String getVehicle() {
			return this.vehicle;
		}

		public String getPlatform() {
			return this.platform;
		}

		public String getTime() {
			return this.time;
		}

		public double getLat() {
			return this.locationX;
		}

		public double getLon() {
			return this.locationY;
		}

		public String getDelay() {
			return this.delay;
		}

	}

}