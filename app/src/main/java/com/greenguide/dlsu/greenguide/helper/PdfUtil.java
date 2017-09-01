package com.greenguide.dlsu.greenguide.helper;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Environment;
import android.support.v4.content.FileProvider;
import android.util.Log;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by Yep on 7/15/2017.
 */

public class PdfUtil
{
	private static final String TAG = "PdfUtil";

	public static void OpenPdfIntent(Context context, String filename)
	{
		Intent intent = new Intent(Intent.ACTION_VIEW);
		Uri uri = null;

		File file = new File(Environment.getExternalStorageDirectory() + "/" + filename);
		if (!file.exists())
			writeToSdCard(context, filename);

		if (file.exists())
		{
			uri = FileProvider.getUriForFile(context, context.getPackageName() + ".com.greenguide.dlsu.greenguide.provider", file);
			intent.setDataAndType(uri, "application/pdf");
			intent.setFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
		}

		intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
		intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		context.startActivity(intent);

	}

	//method to write the PDFs file to sd card
	private static void writeToSdCard(Context context, String filename)
	{
		AssetManager assetManager = context.getAssets();
		String[] files = null;
		try
		{
			files = assetManager.list("");
		}
		catch (IOException e)
		{
			Log.e(TAG, e.getMessage());
		}
		for (int i = 0; i < files.length; i++)
		{
			String fStr = files[i];
			if (fStr.equalsIgnoreCase(filename))
			{
				InputStream in;
				OutputStream out;
				try
				{
					in = assetManager.open(files[i]);
					out = new FileOutputStream(Environment.getExternalStorageDirectory() + "/" + files[i]);
					copyFile(in, out);
					in.close();
					out.flush();
					out.close();
					break;
				}
				catch (Exception e)
				{
					Log.e(TAG, e.getMessage());
				}
			}
		}
	}

	private static void copyFile(InputStream in, OutputStream out) throws IOException
	{
		byte[] buffer = new byte[1024];
		int read;
		while ((read = in.read(buffer)) != -1)
		{
			out.write(buffer, 0, read);
		}
	}
}
