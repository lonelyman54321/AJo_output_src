/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.CheckedTextView
 */
package androidx.media3.ui;

import android.view.View;
import android.widget.CheckedTextView;
import androidx.media3.ui.TrackSelectionView;
import androidx.media3.ui.TrackSelectionView$b;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public final class TrackSelectionView$a
implements View.OnClickListener {
    public final /* synthetic */ TrackSelectionView a;

    public TrackSelectionView$a(TrackSelectionView trackSelectionView) {
        this.a = trackSelectionView;
    }

    public final void onClick(View object) {
        TrackSelectionView trackSelectionView = this.a;
        Object object2 = trackSelectionView.c;
        HashMap hashMap = trackSelectionView.g;
        int n3 = 1;
        if (object == object2) {
            trackSelectionView.l = n3;
            hashMap.clear();
        } else {
            object2 = trackSelectionView.d;
            if (object == object2) {
                trackSelectionView.l = false;
                hashMap.clear();
            } else {
                trackSelectionView.l = false;
                object2 = object.getTag();
                object2.getClass();
                object2 = (TrackSelectionView$b)object2;
                bq3$a bq3$a = ((TrackSelectionView$b)object2).a;
                qp3 qp32 = bq3$a.b;
                Object object3 = (Ep3)hashMap.get(qp32);
                int n4 = ((TrackSelectionView$b)object2).b;
                if (object3 == null) {
                    int n7 = trackSelectionView.i;
                    if (n7 == 0 && (n7 = hashMap.size()) > 0) {
                        hashMap.clear();
                    }
                    object2 = ImmutableList.of((Object)n4);
                    object = new Ep3(qp32, (List)object2);
                    hashMap.put(qp32, object);
                } else {
                    boolean bl2;
                    object3 = ((Ep3)object3).b;
                    ArrayList<View> arrayList = new ArrayList<View>((Collection<View>)object3);
                    object = (CheckedTextView)object;
                    boolean bl3 = object.isChecked();
                    int n8 = trackSelectionView.h;
                    if (n8 != 0 && (bl2 = bq3$a.c)) {
                        bl2 = true;
                    } else {
                        bl2 = false;
                        bq3$a = null;
                    }
                    if (!(bl2 || (n8 = trackSelectionView.i) != 0 && (n8 = ((ArrayList)(object3 = trackSelectionView.f)).size()) > n3)) {
                        n3 = 0;
                    }
                    if (bl3 && n3 != 0) {
                        object = n4;
                        arrayList.remove(object);
                        bl3 = arrayList.isEmpty();
                        if (bl3) {
                            hashMap.remove(qp32);
                        } else {
                            object = new Ep3(qp32, arrayList);
                            hashMap.put(qp32, object);
                        }
                    } else if (!bl3) {
                        if (bl2) {
                            object = n4;
                            arrayList.add((View)object);
                            object = new Ep3(qp32, arrayList);
                            hashMap.put(qp32, object);
                        } else {
                            object2 = ImmutableList.of((Object)n4);
                            object = new Ep3(qp32, (List)object2);
                            hashMap.put(qp32, object);
                        }
                    }
                }
            }
        }
        trackSelectionView.a();
    }
}

