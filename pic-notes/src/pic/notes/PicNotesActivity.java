package pic.notes;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;

public class PicNotesActivity extends Activity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		// Button button = (Button)findViewById(R.id.button1);
		// //button.setOnClickListener(....);
		// button.setOnLongClickListener(new OnLongClickListener() {
		//
		// @Override
		// public boolean onLongClick(View v) {
		// return false;
		// }
		// });

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
		Intent camIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
		// File testPic = new File(Environment.getExternalStorageDirectory(), "Pic2.jpg");
		// camIntent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(testPic));
		startActivityForResult(camIntent, 1012);

	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {

		if (requestCode == 1012) {
			Bitmap bmp = (Bitmap) data.getExtras().get("data");
			ImageView imageViewCam = (ImageView) findViewById(R.id.imageView1);
			imageViewCam.setImageBitmap(bmp);
		}
	}

}
