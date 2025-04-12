/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package in.juspay.hypersdk.mystique;

import in.juspay.hypersdk.mystique.AnimationHolder;
import org.json.JSONObject;

class AnimationHolder$CallbackHolder {
    private static final String ON_ANIMATION_END = "onAnimationEnd";
    private static final String ON_ANIMATION_START = "onAnimationStart";
    private static final String ON_ANIMATION_UPDATE = "onAnimationUpdate";
    private String onEnd;
    private String onStart;
    private String onUpdate;
    final /* synthetic */ AnimationHolder this$0;

    public AnimationHolder$CallbackHolder(AnimationHolder animationHolder) {
        this.this$0 = animationHolder;
    }

    public String getOnEnd() {
        return this.onEnd;
    }

    public String getOnStart() {
        return this.onStart;
    }

    public String getOnUpdate() {
        return this.onUpdate;
    }

    public void updateCallbacks(JSONObject object) {
        if (object == null) {
            return;
        }
        Object object2 = this.this$0;
        String string2 = this.onEnd;
        this.onEnd = object2 = AnimationHolder.access$000((AnimationHolder)object2, object, ON_ANIMATION_END, string2);
        object2 = this.this$0;
        string2 = this.onStart;
        this.onStart = object2 = AnimationHolder.access$000((AnimationHolder)object2, object, ON_ANIMATION_START, string2);
        object2 = this.this$0;
        string2 = this.onUpdate;
        object = AnimationHolder.access$000((AnimationHolder)object2, object, ON_ANIMATION_UPDATE, string2);
        this.onUpdate = object;
    }
}

