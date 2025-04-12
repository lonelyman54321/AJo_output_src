/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 */
package in.juspay.hypersdk.lifecycle;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import in.juspay.hypersdk.lifecycle.ActivityResultHolder;
import in.juspay.hypersdk.lifecycle.EventListener;
import in.juspay.hypersdk.lifecycle.FragmentEvent;
import in.juspay.hypersdk.lifecycle.HyperFragment$WhenMappings;
import in.juspay.hypersdk.lifecycle.RequestPermissionResult;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.internal.Intrinsics;

public final class HyperFragment
extends Fragment {
    private final LinkedList onActivityResultListeners;
    private final LinkedList onAttachListeners;
    private final LinkedList onDestroyListeners;
    private final LinkedList onPauseListeners;
    private final LinkedList onRequestPermissionsResultListeners;
    private final LinkedList onResumeListeners;
    private final LinkedList onSaveInstanceListeners;
    private final LinkedList onStopListeners;

    public HyperFragment() {
        LinkedList linkedList;
        this.onPauseListeners = linkedList = new LinkedList();
        this.onStopListeners = linkedList = new LinkedList();
        this.onResumeListeners = linkedList = new LinkedList();
        this.onDestroyListeners = linkedList = new LinkedList();
        this.onSaveInstanceListeners = linkedList = new LinkedList();
        this.onAttachListeners = linkedList = new LinkedList();
        this.onActivityResultListeners = linkedList = new LinkedList();
        this.onRequestPermissionsResultListeners = linkedList = new LinkedList();
    }

    private final void unRegisterForEvent(FragmentEvent object) {
        int[] nArray = HyperFragment$WhenMappings.$EnumSwitchMapping$0;
        int n3 = ((Enum)object).ordinal();
        n3 = nArray[n3];
        switch (n3) {
            default: {
                break;
            }
            case 8: {
                object = this.onRequestPermissionsResultListeners;
                ((LinkedList)object).clear();
                break;
            }
            case 7: {
                object = this.onActivityResultListeners;
                ((LinkedList)object).clear();
                break;
            }
            case 6: {
                object = this.onAttachListeners;
                ((LinkedList)object).clear();
                break;
            }
            case 5: {
                object = this.onSaveInstanceListeners;
                ((LinkedList)object).clear();
                break;
            }
            case 4: {
                object = this.onDestroyListeners;
                ((LinkedList)object).clear();
                break;
            }
            case 3: {
                object = this.onStopListeners;
                ((LinkedList)object).clear();
                break;
            }
            case 2: {
                object = this.onResumeListeners;
                ((LinkedList)object).clear();
                break;
            }
            case 1: {
                object = this.onPauseListeners;
                ((LinkedList)object).clear();
            }
        }
    }

    public void onActivityResult(int n3, int n4, Intent intent) {
        boolean bl2;
        super.onActivityResult(n3, n4, intent);
        Iterator iterator = ((AbstractCollection)this.onActivityResultListeners).iterator();
        while (bl2 = iterator.hasNext()) {
            ActivityResultHolder activityResultHolder = (ActivityResultHolder)iterator.next();
            activityResultHolder.onActivityResult(n3, n4, intent);
        }
    }

    public void onAttach(Context object) {
        boolean bl2;
        Object object2 = "context";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        super.onAttach((Context)object);
        object = ((AbstractCollection)this.onAttachListeners).iterator();
        while (bl2 = object.hasNext()) {
            object2 = (EventListener)object.next();
            String string2 = "{}";
            object2.onEvent(string2, this);
        }
    }

    public void onDestroy() {
        String string2;
        int n3;
        super.onDestroy();
        FragmentEvent[] fragmentEventArray = ((AbstractCollection)this.onDestroyListeners).iterator();
        while ((n3 = fragmentEventArray.hasNext()) != 0) {
            EventListener eventListener = (EventListener)fragmentEventArray.next();
            string2 = "{}";
            eventListener.onEvent(string2, this);
        }
        fragmentEventArray = FragmentEvent.values();
        n3 = fragmentEventArray.length;
        string2 = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            FragmentEvent fragmentEvent = fragmentEventArray[i3];
            this.unRegisterForEvent(fragmentEvent);
        }
    }

    public void onPause() {
        boolean bl2;
        super.onPause();
        Iterator iterator = ((AbstractCollection)this.onPauseListeners).iterator();
        while (bl2 = iterator.hasNext()) {
            EventListener eventListener = (EventListener)iterator.next();
            String string2 = "{}";
            eventListener.onEvent(string2, this);
        }
    }

    public void onRequestPermissionsResult(int n3, String[] stringArray, int[] nArray) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(stringArray, "permissions");
        Intrinsics.checkNotNullParameter(nArray, "grantResults");
        super.onRequestPermissionsResult(n3, stringArray, nArray);
        Iterator iterator = ((AbstractCollection)this.onRequestPermissionsResultListeners).iterator();
        while (bl2 = iterator.hasNext()) {
            RequestPermissionResult requestPermissionResult = (RequestPermissionResult)iterator.next();
            requestPermissionResult.onRequestPermissionsResult(n3, stringArray, nArray);
        }
    }

    public void onResume() {
        boolean bl2;
        super.onResume();
        Iterator iterator = ((AbstractCollection)this.onResumeListeners).iterator();
        while (bl2 = iterator.hasNext()) {
            EventListener eventListener = (EventListener)iterator.next();
            String string2 = "{}";
            eventListener.onEvent(string2, this);
        }
    }

    public void onSaveInstanceState(Bundle object) {
        boolean bl2;
        Object object2 = "outState";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        super.onSaveInstanceState((Bundle)object);
        object = ((AbstractCollection)this.onSaveInstanceListeners).iterator();
        while (bl2 = object.hasNext()) {
            object2 = (EventListener)object.next();
            String string2 = "{}";
            object2.onEvent(string2, this);
        }
    }

    public void onStop() {
        boolean bl2;
        super.onStop();
        Iterator iterator = ((AbstractCollection)this.onStopListeners).iterator();
        while (bl2 = iterator.hasNext()) {
            EventListener eventListener = (EventListener)iterator.next();
            String string2 = "{}";
            eventListener.onEvent(string2, this);
        }
    }

    public final void registerForEvent(FragmentEvent object, EventListener eventListener) {
        Intrinsics.checkNotNullParameter(object, "event");
        Intrinsics.checkNotNullParameter(eventListener, "listener");
        int[] nArray = HyperFragment$WhenMappings.$EnumSwitchMapping$0;
        int n3 = ((Enum)object).ordinal();
        n3 = nArray[n3];
        switch (n3) {
            default: {
                break;
            }
            case 6: {
                object = this.onAttachListeners;
                ((LinkedList)object).add(eventListener);
                break;
            }
            case 5: {
                object = this.onSaveInstanceListeners;
                ((LinkedList)object).add(eventListener);
                break;
            }
            case 4: {
                object = this.onDestroyListeners;
                ((LinkedList)object).add(eventListener);
                break;
            }
            case 3: {
                object = this.onStopListeners;
                ((LinkedList)object).add(eventListener);
                break;
            }
            case 2: {
                object = this.onResumeListeners;
                ((LinkedList)object).add(eventListener);
                break;
            }
            case 1: {
                object = this.onPauseListeners;
                ((LinkedList)object).add(eventListener);
            }
        }
    }

    public final void registerOnActivityResult(ActivityResultHolder activityResultHolder) {
        Intrinsics.checkNotNullParameter(activityResultHolder, "listener");
        this.onActivityResultListeners.add(activityResultHolder);
    }

    public final void registerOnRequestPermissionResult(RequestPermissionResult requestPermissionResult) {
        Intrinsics.checkNotNullParameter(requestPermissionResult, "listener");
        this.onRequestPermissionsResultListeners.add(requestPermissionResult);
    }
}

