package wangdaye.com.geometricweather.background.receiver.widget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;

import wangdaye.com.geometricweather.background.ServiceHelper;

/**
 * Widget clock day vertical provider.
 * */

public class WidgetClockDayVerticalProvider extends AppWidgetProvider {

    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        super.onUpdate(context, appWidgetManager, appWidgetIds);
        ServiceHelper.startAwakePollingUpdateService(context);
    }
}