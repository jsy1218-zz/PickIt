package pagefragment;
import com.example.govege.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainPageFragment extends Fragment {
	
	public MainPageFragment newInstance(int sectionNum){
		return new MainPageFragment();
	}
	
	public MainPageFragment(){
		
	}
	private static final String ARG_SECTION_NUMBER = "section_number";
	/**
	 * Returns a new instance of this fragment for the given section number.
	 
	public static PlaceholderFragment newInstance(int sectionNumber) {
		PlaceholderFragment fragment = new PlaceholderFragment();
		Bundle args = new Bundle();
		args.putInt(ARG_SECTION_NUMBER, sectionNumber);

		fragment.setArguments(args);

		return fragment;

	}

	public PlaceholderFragment() {

	}

*/
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,

			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.main_fragment, container,

				false);


		return rootView;
	}
}
