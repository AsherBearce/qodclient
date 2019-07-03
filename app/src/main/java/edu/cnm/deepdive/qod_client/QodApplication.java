package edu.cnm.deepdive.qod_client;

import android.app.Application;

public class QodApplication extends Application {
  @Override
  public void onCreate() {
    super.onCreate();
    // This is where we would initialize Stetho, Picasso, etc.
    // Also where we could do some non-trivial DB operation to force database creation.
  }
}
