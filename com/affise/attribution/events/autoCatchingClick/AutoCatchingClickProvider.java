/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 */
package com.affise.attribution.events.autoCatchingClick;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.affise.attribution.events.Event;
import com.affise.attribution.events.StoreEventUseCase;
import com.affise.attribution.events.autoCatchingClick.AutoCatchingClickData;
import com.affise.attribution.events.autoCatchingClick.AutoCatchingClickEvent;
import com.affise.attribution.events.autoCatchingClick.AutoCatchingClickProvider$Companion;
import com.affise.attribution.events.autoCatchingClick.AutoCatchingType;
import com.affise.attribution.utils.ActivityActionsManager;
import com.affise.attribution.utils.ActivityClickCallback;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.f;
import kotlin.text.StringsKt;

public final class AutoCatchingClickProvider {
    public static final AutoCatchingClickProvider$Companion Companion;
    private static final String KEY_BUTTON = "Button";
    private final ActivityActionsManager activityActionsManager;
    private ActivityClickCallback activityClickCallback;
    private final StoreEventUseCase storeEventUseCase;
    private List types;

    static {
        AutoCatchingClickProvider$Companion autoCatchingClickProvider$Companion;
        Companion = autoCatchingClickProvider$Companion = new AutoCatchingClickProvider$Companion(null);
    }

    public AutoCatchingClickProvider(StoreEventUseCase storeEventUseCase2, ActivityActionsManager activityActionsManager2) {
        Intrinsics.checkNotNullParameter(storeEventUseCase2, "storeEventUseCase");
        Intrinsics.checkNotNullParameter(activityActionsManager2, "activityActionsManager");
        this.storeEventUseCase = storeEventUseCase2;
        this.activityActionsManager = activityActionsManager2;
    }

    public static /* synthetic */ void a(AutoCatchingClickProvider autoCatchingClickProvider, Activity activity, View view) {
        AutoCatchingClickProvider.init$lambda$1(autoCatchingClickProvider, activity, view);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final List getDataView(View object, boolean bl2) {
        void var2_17;
        void var1_16;
        void var10_32;
        CharSequence charSequence;
        Object object2;
        int n3;
        int n4;
        Object object3;
        int n7;
        ArrayList arrayList;
        ArrayList<AutoCatchingClickData> arrayList2;
        block27: {
            block26: {
                block24: {
                    Throwable throwable2;
                    block25: {
                        block23: {
                            arrayList2 = this.types;
                            arrayList = null;
                            if (arrayList2 == null) {
                                return null;
                            }
                            n7 = object.getId();
                            object3 = n7;
                            n4 = -1;
                            if (n7 == n4) {
                                n3 = 0;
                                object3 = null;
                            }
                            if (object3 == null) break block26;
                            try {
                                object2 = tl2_2.b;
                                n7 = ((Number)object3).intValue();
                                object3 = object.getResources();
                                if (object3 == null) break block23;
                                object2 = object3.getResourceEntryName(n7);
                                break block24;
                            }
                            catch (Throwable throwable2) {
                                break block25;
                            }
                        }
                        n7 = 0;
                        object2 = null;
                        break block24;
                    }
                    object3 = tl2_2.b;
                    object2 = vl2_2.a(throwable2);
                }
                n3 = object2 instanceof tL2$b;
                if (n3 != 0) {
                    n7 = 0;
                    object2 = null;
                }
                if ((object2 = (String)object2) != null && (n3 = ((String)object2).length()) != 0) break block27;
            }
            n7 = 0;
            object2 = null;
        }
        if ((object3 = object.getTag()) != null) {
            object3 = object3.toString();
        } else {
            n3 = 0;
            object3 = null;
        }
        String string2 = object.getClass().getCanonicalName();
        if (string2 == null) {
            String string3 = "";
        }
        charSequence = (charSequence = object.getContentDescription()) != null ? ((Object)charSequence).toString() : null;
        boolean bl3 = object instanceof TextView;
        String string4 = KEY_BUTTON;
        if (bl3) {
            void var14_41;
            boolean bl4 = StringsKt.F((CharSequence)var10_32, string4, false);
            if (bl4) {
                AutoCatchingType autoCatchingType = AutoCatchingType.BUTTON;
                boolean bl5 = arrayList2.contains((Object)autoCatchingType);
                if (!bl5) return null;
                CharSequence charSequence2 = ((TextView)object).getText();
                if (charSequence2 != null) {
                    arrayList = ((Object)charSequence2).toString();
                }
                String string5 = "BUTTON";
                AutoCatchingClickData autoCatchingClickData = new AutoCatchingClickData((String)object2, (String)((Object)arrayList), (String)object3, string5);
            } else {
                AutoCatchingType autoCatchingType = AutoCatchingType.TEXT;
                boolean bl6 = arrayList2.contains((Object)autoCatchingType);
                if (!bl6) return null;
                CharSequence charSequence3 = ((TextView)object).getText();
                if (charSequence3 != null) {
                    arrayList = ((Object)charSequence3).toString();
                }
                String string6 = "TEXT";
                AutoCatchingClickData autoCatchingClickData = new AutoCatchingClickData((String)object2, (String)((Object)arrayList), (String)object3, string6);
            }
            List list = a.b(var14_41);
            return var1_16;
        }
        bl3 = object instanceof ImageView;
        if (bl3) {
            void var1_12;
            boolean bl7 = StringsKt.F((CharSequence)var10_32, string4, false);
            if (bl7) {
                AutoCatchingType autoCatchingType = AutoCatchingType.IMAGE_BUTTON;
                bl7 = arrayList2.contains((Object)autoCatchingType);
                if (!bl7) return null;
                String string7 = "IMAGE_BUTTON";
                AutoCatchingClickData autoCatchingClickData = new AutoCatchingClickData((String)object2, (String)charSequence, (String)object3, string7);
            } else {
                AutoCatchingType autoCatchingType = AutoCatchingType.IMAGE;
                bl7 = arrayList2.contains((Object)autoCatchingType);
                if (!bl7) return null;
                String string8 = "IMAGE";
                AutoCatchingClickData autoCatchingClickData = new AutoCatchingClickData((String)object2, (String)charSequence, (String)object3, string8);
            }
            List list = a.b(var1_12);
            return var1_16;
        }
        n4 = object instanceof ViewGroup;
        if (n4 == 0) return null;
        AutoCatchingType autoCatchingType = AutoCatchingType.GROUP;
        boolean bl8 = arrayList2.contains((Object)autoCatchingType);
        if (!bl8) return null;
        arrayList2 = new ArrayList<AutoCatchingClickData>();
        if (var2_17 != false) {
            arrayList = "GROUP";
            AutoCatchingClickData autoCatchingClickData = new AutoCatchingClickData((String)object2, (String)charSequence, (String)object3, (String)((Object)arrayList));
            arrayList2.add(autoCatchingClickData);
        }
        ViewGroup viewGroup = (ViewGroup)object;
        int n8 = viewGroup.getChildCount();
        IntRange intRange = f.m(0, n8);
        arrayList = new ArrayList();
        ui1_2 ui1_22 = intRange.d();
        while (true) {
            if ((n7 = (int)(ui1_22.c ? 1 : 0)) == 0) {
                arrayList2.addAll(arrayList);
                ArrayList<AutoCatchingClickData> arrayList3 = arrayList2;
                return var1_16;
            }
            n7 = ((mi1_2)ui1_22).nextInt();
            object2 = viewGroup.getChildAt(n7);
            object3 = "view.getChildAt(it)";
            Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
            object2 = this.getDataView((View)object2, false);
            if (object2 == null) {
                object2 = mz0_2.a;
            }
            object2 = (Iterable)object2;
            cx_2.r((Iterable)object2, arrayList);
        }
    }

    public static /* synthetic */ List getDataView$default(AutoCatchingClickProvider autoCatchingClickProvider, View view, boolean bl2, int n3, Object object) {
        if ((n3 &= 2) != 0) {
            bl2 = true;
        }
        return autoCatchingClickProvider.getDataView(view, bl2);
    }

    private static final void init$lambda$1(AutoCatchingClickProvider object, Activity object2, View view) {
        Intrinsics.checkNotNullParameter(object, "this$0");
        Intrinsics.checkNotNullParameter(object2, "activity");
        Object object3 = "view";
        Intrinsics.checkNotNullParameter(view, (String)object3);
        int n3 = 2;
        List list = AutoCatchingClickProvider.getDataView$default((AutoCatchingClickProvider)object, view, false, n3, null);
        if (list != null) {
            object = ((AutoCatchingClickProvider)object).storeEventUseCase;
            boolean bl2 = view instanceof ViewGroup;
            String string2 = object2.getClass().getSimpleName();
            object2 = "activity::class.java.simpleName";
            Intrinsics.checkNotNullExpressionValue(string2, (String)object2);
            int n4 = 8;
            long l2 = 0L;
            object3 = new AutoCatchingClickEvent(bl2, list, string2, l2, n4, null);
            object.storeEvent((Event)object3);
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void init(List object) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        this.types = object;
                        object = this.activityClickCallback;
                        if (object != null) break block4;
                        object = new xr_0(this);
                        ActivityActionsManager activityActionsManager2 = this.activityActionsManager;
                        activityActionsManager2.addOnActivityClickListener((ActivityClickCallback)object);
                        this.activityClickCallback = object;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    public final void setTypes(List list) {
        this.types = list;
    }
}

