package tof.cv.mpp.rss;

import java.net.MalformedURLException;
import java.net.URL;

import tof.cv.mpp.R;
import tof.cv.mpp.TrafficFragment;
import tof.cv.mpp.adapter.TrafficAdapter;
import android.content.Context;
import android.os.AsyncTask;
import android.view.LayoutInflater;
import android.widget.TextView;

public class DownloadTrafficTask extends AsyncTask<URL, Integer, Long> {

	private RSSFeed myRssFeed;
	private Context context;
	private LayoutInflater layoutInflater;
	private String lang;
	private TrafficFragment trafFrag;

	public DownloadTrafficTask(TrafficFragment trafFrag) {
		this.trafFrag = trafFrag;
		context = trafFrag.getActivity();
		myRssFeed = trafFrag.getRssFeed();
		layoutInflater = trafFrag.getActivity().getLayoutInflater();
		lang = trafFrag.getLang();
	}

	protected Long doInBackground(URL... params) {
		updateData();
		return null;
	}

	protected void onPostExecute(Long result) {

		if (myRssFeed != null) {

			TrafficAdapter adapter = new TrafficAdapter(context,
					R.layout.row_rss, myRssFeed.getList(), layoutInflater,
					myRssFeed);
			trafFrag.setListAdapter(adapter);
			trafFrag.setRssFeed(myRssFeed);

		}

		new DownloadOtherTrafficTask(trafFrag).execute();
	}

	private void updateData() {

		try {
			/*
			 * getting rss feed from the railtime.be website
			 */
			URL rssUrl = new URL(
					"http://www.railtime.be/website/RSS/RssInfoBar_" + lang
							+ ".xml");

			RSSDocument rssDoc = new RSSDocument(rssUrl);
			myRssFeed = rssDoc.getRSSFeed();

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
