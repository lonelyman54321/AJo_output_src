/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Dialog
 */
package com.getkeepsafe.taptargetview;

import android.app.Activity;
import android.app.Dialog;
import com.getkeepsafe.taptargetview.TapTarget;
import com.getkeepsafe.taptargetview.TapTargetSequence$1;
import com.getkeepsafe.taptargetview.TapTargetSequence$Listener;
import com.getkeepsafe.taptargetview.TapTargetView;
import com.getkeepsafe.taptargetview.TapTargetView$Listener;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;

public class TapTargetSequence {
    private boolean active;
    private final Activity activity;
    boolean considerOuterCircleCanceled;
    boolean continueOnCancel;
    private TapTargetView currentView;
    private final Dialog dialog;
    TapTargetSequence$Listener listener;
    private final TapTargetView$Listener tapTargetListener;
    private final Queue targets;

    public TapTargetSequence(Activity object) {
        TapTargetSequence$1 tapTargetSequence$1 = new TapTargetSequence$1(this);
        this.tapTargetListener = tapTargetSequence$1;
        if (object != null) {
            this.activity = object;
            this.dialog = null;
            this.targets = object;
            return;
        }
        super("Activity is null");
        throw object;
    }

    public TapTargetSequence(Dialog object) {
        TapTargetSequence$1 tapTargetSequence$1 = new TapTargetSequence$1(this);
        this.tapTargetListener = tapTargetSequence$1;
        if (object != null) {
            this.dialog = object;
            this.activity = null;
            this.targets = object;
            return;
        }
        super("Given null Dialog");
        throw object;
    }

    public boolean cancel() {
        boolean bl2;
        Object object;
        boolean bl3 = this.active;
        TapTarget tapTarget = null;
        if (bl3 && (object = this.currentView) != null && (bl2 = ((TapTargetView)((Object)object)).cancelable)) {
            ((TapTargetView)((Object)object)).dismiss(false);
            this.active = false;
            this.targets.clear();
            object = this.listener;
            if (object != null) {
                tapTarget = this.currentView.target;
                object.onSequenceCanceled(tapTarget);
            }
            return true;
        }
        return false;
    }

    public TapTargetSequence considerOuterCircleCanceled(boolean bl2) {
        this.considerOuterCircleCanceled = bl2;
        return this;
    }

    public TapTargetSequence continueOnCancel(boolean bl2) {
        this.continueOnCancel = bl2;
        return this;
    }

    public TapTargetSequence listener(TapTargetSequence$Listener tapTargetSequence$Listener) {
        this.listener = tapTargetSequence$Listener;
        return this;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void showNext() {
        Object object;
        block4: {
            Activity activity;
            try {
                object = this.targets;
                object = object.remove();
                object = (TapTarget)object;
                activity = this.activity;
                if (activity != null) {
                    TapTargetView$Listener tapTargetView$Listener = this.tapTargetListener;
                    object = TapTargetView.showFor(activity, (TapTarget)object, tapTargetView$Listener);
                    this.currentView = object;
                    return;
                }
            }
            catch (NoSuchElementException noSuchElementException) {
                break block4;
            }
            {
                activity = this.dialog;
                TapTargetView$Listener tapTargetView$Listener = this.tapTargetListener;
                object = TapTargetView.showFor((Dialog)activity, (TapTarget)object, tapTargetView$Listener);
                this.currentView = object;
                return;
            }
        }
        this.currentView = null;
        object = this.listener;
        if (object == null) return;
        object.onSequenceFinish();
    }

    public void start() {
        Queue queue = this.targets;
        boolean bl2 = queue.isEmpty();
        if (!bl2 && !(bl2 = this.active)) {
            this.active = bl2 = true;
            this.showNext();
        }
    }

    public void startAt(int n3) {
        Object object;
        int n4 = this.active;
        if (n4 != 0) {
            return;
        }
        if (n3 >= 0 && n3 < (n4 = (object = this.targets).size())) {
            int n7;
            Object object2;
            object = this.targets;
            n4 = object.size() - n3;
            while ((object2 = this.targets.peek()) != null && (n7 = (object2 = this.targets).size()) != n4) {
                object2 = this.targets;
                object2.poll();
            }
            object2 = this.targets;
            n7 = object2.size();
            if (n7 == n4) {
                this.start();
                return;
            }
            String string2 = Gj0.b(n3, "Given index ", " not in sequence");
            object = new IllegalStateException(string2);
            throw object;
        }
        String string3 = hj0_0.a(n3, "Given invalid index ");
        object = new IllegalArgumentException(string3);
        throw object;
    }

    public void startWith(int n3) {
        Object object;
        int n4 = this.active;
        if (n4 != 0) {
            return;
        }
        while ((object = this.targets.peek()) != null && (n4 = ((TapTarget)(object = (TapTarget)this.targets.peek())).id()) != n3) {
            object = this.targets;
            object.poll();
        }
        object = (TapTarget)this.targets.peek();
        if (object != null && (n4 = ((TapTarget)object).id()) == n3) {
            this.start();
            return;
        }
        String string2 = Gj0.b(n3, "Given target ", " not in sequence");
        object = new IllegalStateException(string2);
        throw object;
    }

    public TapTargetSequence target(TapTarget tapTarget) {
        this.targets.add(tapTarget);
        return this;
    }

    public TapTargetSequence targets(List list) {
        this.targets.addAll(list);
        return this;
    }

    public TapTargetSequence targets(TapTarget ... tapTargetArray) {
        Collections.addAll(this.targets, tapTargetArray);
        return this;
    }
}

