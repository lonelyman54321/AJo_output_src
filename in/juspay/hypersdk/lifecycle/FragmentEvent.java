/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hypersdk.lifecycle;

public final class FragmentEvent
extends Enum {
    private static final /* synthetic */ FragmentEvent[] $VALUES;
    public static final /* enum */ FragmentEvent ON_ACTIVITY_RESULT;
    public static final /* enum */ FragmentEvent ON_ATTACH;
    public static final /* enum */ FragmentEvent ON_DESTROY;
    public static final /* enum */ FragmentEvent ON_PAUSE;
    public static final /* enum */ FragmentEvent ON_REQUEST_PERMISSION_RESULT;
    public static final /* enum */ FragmentEvent ON_RESUME;
    public static final /* enum */ FragmentEvent ON_SAVED_STATE_INSTANCE;
    public static final /* enum */ FragmentEvent ON_STOP;
    private final String key;

    private static final /* synthetic */ FragmentEvent[] $values() {
        FragmentEvent fragmentEvent = ON_PAUSE;
        fragmentEvent = ON_RESUME;
        fragmentEvent = ON_STOP;
        fragmentEvent = ON_DESTROY;
        fragmentEvent = ON_SAVED_STATE_INSTANCE;
        fragmentEvent = ON_ACTIVITY_RESULT;
        fragmentEvent = ON_REQUEST_PERMISSION_RESULT;
        fragmentEvent = ON_ATTACH;
        FragmentEvent[] fragmentEventArray = new FragmentEvent[]{fragmentEvent, fragmentEvent, fragmentEvent, fragmentEvent, fragmentEvent, fragmentEvent, fragmentEvent, fragmentEvent};
        return fragmentEventArray;
    }

    static {
        FragmentEvent fragmentEvent;
        ON_PAUSE = fragmentEvent = new FragmentEvent("ON_PAUSE", 0, "onPause");
        ON_RESUME = fragmentEvent = new FragmentEvent("ON_RESUME", 1, "onResume");
        ON_STOP = fragmentEvent = new FragmentEvent("ON_STOP", 2, "onStop");
        ON_DESTROY = fragmentEvent = new FragmentEvent("ON_DESTROY", 3, "onDestroy");
        ON_SAVED_STATE_INSTANCE = fragmentEvent = new FragmentEvent("ON_SAVED_STATE_INSTANCE", 4, "OnSavedStateInstance");
        ON_ACTIVITY_RESULT = fragmentEvent = new FragmentEvent("ON_ACTIVITY_RESULT", 5, "onActivityResult");
        ON_REQUEST_PERMISSION_RESULT = fragmentEvent = new FragmentEvent("ON_REQUEST_PERMISSION_RESULT", 6, "onRequestPermissionResult");
        ON_ATTACH = fragmentEvent = new FragmentEvent("ON_ATTACH", 7, "onAttach");
        $VALUES = FragmentEvent.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private FragmentEvent() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.key = var3_2;
    }

    public static FragmentEvent valueOf(String string2) {
        return Enum.valueOf(FragmentEvent.class, string2);
    }

    public static FragmentEvent[] values() {
        return (FragmentEvent[])$VALUES.clone();
    }

    public final String getKey() {
        return this.key;
    }
}

