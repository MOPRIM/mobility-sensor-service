package fi.moprim.sensing.service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

public abstract class AbstractMobilitySensorService extends Service implements MobilitySensorService {

    private static final String TAG = AbstractMobilitySensorService.class.getSimpleName();
    private final IBinder iBinder = new MobilitySensorServiceBinder();

    public AbstractMobilitySensorService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(TAG, "onStartCommand");
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        Log.d(TAG, "onDestroy");
        super.onDestroy();
    }

    @Override
    public boolean onUnbind(Intent intent) {
        Log.d(TAG, "onUnbind");
        return false;
    }

    @Override
    public void onRebind(Intent intent) {
        Log.d(TAG, "onRebind");
        super.onRebind(intent);
    }

    @Override
    public IBinder onBind(Intent intent) {
        Log.d(TAG, "onBind");
        return iBinder;
    }

    public class MobilitySensorServiceBinder extends Binder {
        MobilitySensorService getService() {
            return AbstractMobilitySensorService.this;
        }
    }
}
