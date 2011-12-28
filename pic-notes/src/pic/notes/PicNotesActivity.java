package pic.notes;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class PicNotesActivity extends Activity {
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
//        Button button = (Button)findViewById(R.id.button1);
//        //button.setOnClickListener(....);
//        button.setOnLongClickListener(new OnLongClickListener() {
//			
//			@Override
//			public boolean onLongClick(View v) {
//				return false;
//			}
//		});
        
        
    }
    
    public void onClickButton1(View v) {
    	System.out.println("PicNotesActivity.onClickButton1()");
    	openBrowser();
    }

    public void onClickButton2(View v) {
    	System.out.println("PicNotesActivity.onClickButton2()");
    	getPicFromCam();
    }
    
	private void openBrowser() {
		Intent browseIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://localhost"));
		startActivity(browseIntent);
		
	}

	private void getPicFromCam() {
	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		
	}
	
}
