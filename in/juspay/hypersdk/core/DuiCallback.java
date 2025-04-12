/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hypersdk.core;

import in.juspay.hyper.core.JsCallback;
import in.juspay.hypersdk.core.DuiLogger;
import in.juspay.hypersdk.core.InflateView;

public interface DuiCallback
extends JsCallback {
    public InflateView getInflateView();

    public DuiLogger getLogger();
}

