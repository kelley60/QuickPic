package seanmkelley.quickpic;

import android.app.Application;
import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by Sean on 6/20/2015.
 */
public class QuickPicApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "yMeNHJ1gcRLobFLhvKPLS7CoK316p1Vpi52omJHE", "q1889DxAa6VjYNPhkBvxshxWXQRiepyXHdcIGS6H");

    }
}
