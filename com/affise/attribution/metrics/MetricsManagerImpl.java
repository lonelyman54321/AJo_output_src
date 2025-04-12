/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.res.Resources$NotFoundException
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.affise.attribution.metrics;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.affise.attribution.converter.StringToSHA1Converter;
import com.affise.attribution.metrics.MetricsManager;
import com.affise.attribution.metrics.MetricsUseCase;
import com.affise.attribution.utils.ActivityActionsManager;
import com.affise.attribution.utils.ActivityClickCallback;
import com.affise.attribution.utils.ActivityLifecycleCallback;
import com.affise.attribution.utils.TimestampKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;
import kotlin.ranges.f;

public final class MetricsManagerImpl
implements MetricsManager {
    private final ActivityActionsManager activityActionsManager;
    private final StringToSHA1Converter converterToSHA1;
    private boolean enabledMetrics;
    private final MetricsUseCase metricsUseCase;
    private HashMap openActivities;

    public MetricsManagerImpl(ActivityActionsManager activityActionsManager2, MetricsUseCase object, StringToSHA1Converter stringToSHA1Converter2) {
        Intrinsics.checkNotNullParameter(activityActionsManager2, "activityActionsManager");
        Intrinsics.checkNotNullParameter(object, "metricsUseCase");
        Intrinsics.checkNotNullParameter(stringToSHA1Converter2, "converterToSHA1");
        this.activityActionsManager = activityActionsManager2;
        this.metricsUseCase = object;
        this.converterToSHA1 = stringToSHA1Converter2;
        object = new HashMap();
        this.openActivities = object;
        object = new SO1(this);
        activityActionsManager2.addOnActivityStartedListener((ActivityLifecycleCallback)object);
        object = new to1_1(this);
        activityActionsManager2.addOnActivityStoppedListener((ActivityLifecycleCallback)object);
        object = new uo1_0(this);
        activityActionsManager2.addOnActivityClickListener((ActivityClickCallback)object);
    }

    private static final void _init_$lambda$0(MetricsManagerImpl metricsManagerImpl, Activity activity) {
        Intrinsics.checkNotNullParameter(metricsManagerImpl, "this$0");
        Intrinsics.checkNotNullParameter(activity, "it");
        metricsManagerImpl.openActivity(activity);
    }

    private static final void _init_$lambda$1(MetricsManagerImpl metricsManagerImpl, Activity activity) {
        Intrinsics.checkNotNullParameter(metricsManagerImpl, "this$0");
        Intrinsics.checkNotNullParameter(activity, "it");
        metricsManagerImpl.closeActivity(activity);
    }

    private static final void _init_$lambda$2(MetricsManagerImpl metricsManagerImpl, Activity activity, View view) {
        Intrinsics.checkNotNullParameter(metricsManagerImpl, "this$0");
        Intrinsics.checkNotNullParameter(activity, "activity");
        String string2 = "view";
        Intrinsics.checkNotNullParameter(view, string2);
        boolean bl2 = metricsManagerImpl.enabledMetrics;
        if (bl2) {
            metricsManagerImpl.clickOnActivity(activity, view);
        }
    }

    public static /* synthetic */ void a(MetricsManagerImpl metricsManagerImpl, Activity activity, View view) {
        MetricsManagerImpl._init_$lambda$2(metricsManagerImpl, activity, view);
    }

    public static /* synthetic */ void b(MetricsManagerImpl metricsManagerImpl, Activity activity) {
        MetricsManagerImpl._init_$lambda$1(metricsManagerImpl, activity);
    }

    public static /* synthetic */ void c(MetricsManagerImpl metricsManagerImpl, Activity activity) {
        MetricsManagerImpl._init_$lambda$0(metricsManagerImpl, activity);
    }

    private final void clickOnActivity(Activity object, View object2) {
        object = object.getClass().getSimpleName();
        StringBuilder stringBuilder = new StringBuilder("AutoCatchingClickEvent_");
        Intrinsics.checkNotNullExpressionValue(object, "activityName");
        object2 = this.getDataKey((String)object, (View)object2);
        stringBuilder.append((String)object2);
        object2 = stringBuilder.toString();
        this.metricsUseCase.addClickOnActivity((String)object, (String)object2);
    }

    private final void closeActivity(Activity object) {
        Object object2 = this.openActivities;
        Object object3 = object.getClass().getSimpleName();
        boolean bl2 = ((HashMap)object2).containsKey(object3);
        if (bl2 && (object3 = (Long)((HashMap)(object2 = this.openActivities)).remove(object3)) != null && (bl2 = this.enabledMetrics)) {
            object2 = this.metricsUseCase;
            object = object.getClass().getSimpleName();
            String string2 = "activity.javaClass.simpleName";
            Intrinsics.checkNotNullExpressionValue(object, string2);
            long l2 = TimestampKt.timestamp();
            long l3 = (Long)object3;
            object2.addOpenActivityTime((String)object, l2 -= l3);
        }
    }

    private final String getDataKey(String string2, View object) {
        StringToSHA1Converter stringToSHA1Converter2 = this.converterToSHA1;
        boolean bl2 = true;
        object = ((Iterable)this.getDataView((View)object, bl2)).iterator();
        while (bl2 = object.hasNext()) {
            String string3 = (String)object.next();
            string2 = Ft2.a(string2, string3);
        }
        return stringToSHA1Converter2.convert(string2);
    }

    private final List getDataView(View object, boolean bl2) {
        List<String> list;
        boolean bl3 = object instanceof ViewGroup;
        if (bl3) {
            Object object2;
            list = new List<String>();
            if (bl2) {
                object2 = this.getViewIdName((View)object);
                ((ArrayList)list).add((String)object2);
            }
            object = (ViewGroup)object;
            int n3 = object.getChildCount();
            object2 = f.m(0, n3);
            ArrayList arrayList = new ArrayList();
            object2 = ((c)object2).iterator();
            while (true) {
                Object object3 = object2;
                object3 = (ui1_2)object2;
                int n4 = ((ui1_2)object3).c;
                if (n4 == 0) break;
                object3 = object2;
                n4 = ((mi1_2)object2).nextInt();
                object3 = object.getChildAt(n4);
                String string2 = "view.getChildAt(it)";
                Intrinsics.checkNotNullExpressionValue(object3, string2);
                object3 = this.getDataView((View)object3, false);
                cx_2.r((Iterable)object3, arrayList);
            }
            ((ArrayList)list).addAll(arrayList);
        } else {
            object = this.getViewIdName((View)object);
            list = a.b(object);
        }
        return list;
    }

    public static /* synthetic */ List getDataView$default(MetricsManagerImpl metricsManagerImpl, View view, boolean bl2, int n3, Object object) {
        if ((n3 &= 2) != 0) {
            bl2 = true;
        }
        return metricsManagerImpl.getDataView(view, bl2);
    }

    private final String getViewIdName(View view) {
        String string2;
        block8: {
            block7: {
                int n3 = view.getId();
                Integer n4 = n3;
                int n7 = n4;
                int n8 = -1;
                string2 = null;
                if (n7 == n8) {
                    n3 = 0;
                    n4 = null;
                }
                if (n4 == null) break block7;
                n3 = n4;
                if ((view = view.getResources()) != null) {
                    String string3 = "resources";
                    Intrinsics.checkNotNullExpressionValue(view, string3);
                    try {
                        string2 = view.getResourceEntryName(n3);
                    }
                    catch (Resources.NotFoundException notFoundException) {}
                }
                if (string2 != null) break block8;
            }
            string2 = "";
        }
        return string2;
    }

    private final void openActivity(Activity object) {
        HashMap hashMap = this.openActivities;
        boolean bl2 = hashMap.containsKey(object = object.getClass().getSimpleName());
        if (!bl2) {
            hashMap = this.openActivities;
            Intrinsics.checkNotNullExpressionValue(object, "activityName");
            long l2 = TimestampKt.timestamp();
            Long l3 = l2;
            hashMap.put(object, l3);
        }
    }

    public void setEnabledMetrics(boolean bl2) {
        this.enabledMetrics = bl2;
    }
}

