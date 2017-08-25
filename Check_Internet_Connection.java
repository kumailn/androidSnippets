import android.net.ConnectivityManager;
import android.net.NetworkInfo;

private boolean checkInternetAccess() {
    ConnectivityManager connectivityManager
          = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
    return (activeNetworkInfo != null && activeNetworkInfo.isConnected());
}
