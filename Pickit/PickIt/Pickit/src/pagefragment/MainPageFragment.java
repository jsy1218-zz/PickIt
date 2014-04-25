package pagefragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.example.govege.R;

public class MainPageFragment extends Fragment {
	
	public static String[] fake = {"Apple", "Pear", "Banana"};
	
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

		View rootView = inflater.inflate(R.layout.main_fragment, container,false);
		ListView lv = (ListView) rootView.findViewById(R.id.suggest_list);
		SimpleAdapter adapter = new SimpleAdapter(this.getActivity(),getData(),R.layout.suggest_item,
				new String[]{"price", "amount", "img"},
				new int[]{R.id.tv_suggest_item_price,R.id.tv_suggest_item_amount,
			R.id.suggest_list_pic});
		
		lv.setAdapter(adapter);
	
		return rootView;
	}
	
	private List<Map<String, Object>> getData(){
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("price", "$50");
		map.put("amount", "1,000");
		map.put("img", R.drawable.apple);
		list.add(map);

		Map<String, Object> map1 = new HashMap<String, Object>();
		map1.put("price", "$500");
		map1.put("amount", "1,000");
		map1.put("img", R.drawable.apple);
		list.add(map1);
		
		Map<String, Object> map2 = new HashMap<String, Object>();
		map2.put("price", "$3000");
		map2.put("amount", "1,000");
		map2.put("img", R.drawable.apple);
		list.add(map2);
		
		return list;
		
	}
}
