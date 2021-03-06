package apssdc.android.broadcastrx;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.Toast;

public class PowerReceiver extends BroadcastReceiver {

    ImageView imageView;

    public PowerReceiver(ImageView imageView) {
        this.imageView = imageView;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        switch (intent.getAction()){
            case Intent.ACTION_POWER_CONNECTED:
                Toast.makeText(context, "CONNECTED", Toast.LENGTH_SHORT).show();
                imageView.setImageResource(R.drawable.charging);
                break;
            case Intent.ACTION_POWER_DISCONNECTED:
                Toast.makeText(context, "DISCONNECTED", Toast.LENGTH_SHORT).show();
                imageView.setImageResource(R.drawable.discharging);
                break;
        }
    }
}
