package tof.cv.adapters;

import java.util.ArrayList;

import tof.cv.bo.Via;
import tof.cv.misc.ConnectionMaker;
import tof.cv.mpp.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ViaAdapter extends AbstractAdapter<Via> {

	Via via;

	public ViaAdapter(Context context, int textViewResourceId,
			ArrayList<Via> items) {
		super(context, textViewResourceId, items);
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View v = convertView;
		if (v == null) {
			LayoutInflater vi = (LayoutInflater) super.getContext()
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			v = vi.inflate(R.layout.row_via, null);
		}
		
		via = items.get(position);
		/*
		final String currentTrain = via.getVehicle();
		
		v.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Toast.makeText(getContext(),currentTrain,
						Toast.LENGTH_SHORT).show();
			}

		});*/


		if (via != null) {

			TextView tvArrivalPlatform = (TextView) v
					.findViewById(R.id.tv_arrival_platform);
			tvArrivalPlatform.setText(via.getArrivalPlatform());

			TextView tvDelay = (TextView) v
			.findViewById(R.id.tv_delay);
			
			tvDelay.setVisibility(View.GONE);
			/*if(via.getDelay().contentEquals("0"))
				tvDelay.setVisibility(View.GONE);
			else
				tvDelay.setText("+"+via.getDelay()+"'");
			*/
			
			TextView tvDeparturePlatform = (TextView) v
					.findViewById(R.id.tv_departure_platform);
			tvDeparturePlatform.setText(via.getDeparturePlatform());

			TextView tvArrivalTime = (TextView) v
					.findViewById(R.id.tv_arrival_time);
			tvArrivalTime.setText(ConnectionMaker.formatDate(via
					.getArrivalTime(), false,false));

			TextView tvDepartureTime = (TextView) v
					.findViewById(R.id.tv_departure_time);
			tvDepartureTime.setText(ConnectionMaker.formatDate(via
					.getDepartureTime(), false,false));

			TextView tvTrain = (TextView) v.findViewById(R.id.tv_train);
			tvTrain.setText(ConnectionMaker.getTrainId(ConnectionMaker
					.getTrainId(via.getVehicle())));

			TextView tvStation = (TextView) v.findViewById(R.id.tv_station);
			tvStation.setText(via.getStationName());

			TextView tvDuration = (TextView) v.findViewById(R.id.tv_duration);
			tvDuration.setText(ConnectionMaker.formatDate(via.getDuration(),
					true,false));

		}
		return v;
	}

}