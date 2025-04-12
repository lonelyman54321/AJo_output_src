/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.usecase;

import com.affise.attribution.converter.Converter;
import com.affise.attribution.events.Event;
import com.affise.attribution.events.OnSendFailedCallback;
import com.affise.attribution.events.OnSendSuccessCallback;
import com.affise.attribution.events.SerializedEvent;
import com.affise.attribution.executors.ExecutorServiceProvider;
import com.affise.attribution.logs.LogsManager;
import com.affise.attribution.network.CloudConfig;
import com.affise.attribution.network.CloudRepository;
import com.affise.attribution.network.HttpResponse;
import com.affise.attribution.parameters.factory.PostBackModelFactory;
import com.affise.attribution.usecase.ImmediateSendToServerUseCase;
import com.affise.attribution.utils.HttpUtilsKt;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;

public final class ImmediateSendToServerUseCaseImpl
implements ImmediateSendToServerUseCase {
    private final CloudRepository cloudRepository;
    private final Converter converterToSerializedEvent;
    private final LogsManager logsManager;
    private final PostBackModelFactory postBackModelFactory;
    private final ExecutorServiceProvider sendServiceProvider;

    public ImmediateSendToServerUseCaseImpl(ExecutorServiceProvider executorServiceProvider, CloudRepository cloudRepository2, PostBackModelFactory postBackModelFactory2, Converter converter, LogsManager logsManager2) {
        Intrinsics.checkNotNullParameter(executorServiceProvider, "sendServiceProvider");
        Intrinsics.checkNotNullParameter(cloudRepository2, "cloudRepository");
        Intrinsics.checkNotNullParameter(postBackModelFactory2, "postBackModelFactory");
        Intrinsics.checkNotNullParameter(converter, "converterToSerializedEvent");
        Intrinsics.checkNotNullParameter(logsManager2, "logsManager");
        this.sendServiceProvider = executorServiceProvider;
        this.cloudRepository = cloudRepository2;
        this.postBackModelFactory = postBackModelFactory2;
        this.converterToSerializedEvent = converter;
        this.logsManager = logsManager2;
    }

    public static /* synthetic */ void a(ImmediateSendToServerUseCaseImpl immediateSendToServerUseCaseImpl, Event event, String string2, OnSendSuccessCallback onSendSuccessCallback, OnSendFailedCallback onSendFailedCallback) {
        ImmediateSendToServerUseCaseImpl.sendNow$lambda$1$lambda$0(immediateSendToServerUseCaseImpl, event, string2, onSendSuccessCallback, onSendFailedCallback);
    }

    private final HttpResponse sendNow(Event object, String object2) {
        Object object3;
        try {
            object3 = this.converterToSerializedEvent;
        }
        catch (Throwable throwable) {
            Object object4;
            this.logsManager.addNetworkError(throwable);
            object3 = throwable.getLocalizedMessage();
            if (object3 == null && (object3 = throwable.getMessage()) == null) {
                String string2 = throwable.toString();
                object4 = string2;
            } else {
                object4 = object3;
            }
            object3 = object2;
            object2 = new HttpResponse(0, (String)object4, null, null, 12, null);
            return object2;
        }
        object = object3.convert(object);
        object = (SerializedEvent)object;
        object3 = this.postBackModelFactory;
        object = a.b(object);
        mz0_2 mz0_22 = mz0_2.a;
        object = ((PostBackModelFactory)object3).create((List)object, mz0_22, mz0_22, mz0_22);
        object3 = this.cloudRepository;
        object = a.b(object);
        return object3.createRequest((String)object2, (List)object);
    }

    private static final void sendNow$lambda$1$lambda$0(ImmediateSendToServerUseCaseImpl object, Event event, String string2, OnSendSuccessCallback onSendSuccessCallback, OnSendFailedCallback onSendFailedCallback) {
        Intrinsics.checkNotNullParameter(object, "this$0");
        Intrinsics.checkNotNullParameter(event, "$event");
        Intrinsics.checkNotNullParameter(string2, "$url");
        Intrinsics.checkNotNullParameter(onSendSuccessCallback, "$success");
        String string3 = "$failed";
        Intrinsics.checkNotNullParameter(onSendFailedCallback, string3);
        object = ((ImmediateSendToServerUseCaseImpl)object).sendNow(event, string2);
        boolean bl2 = HttpUtilsKt.isHttpValid((HttpResponse)object);
        if (bl2) {
            onSendSuccessCallback.handle();
        } else {
            onSendFailedCallback.handle((HttpResponse)object);
        }
    }

    public void sendNow(Event event, OnSendSuccessCallback onSendSuccessCallback, OnSendFailedCallback onSendFailedCallback) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(onSendSuccessCallback, "success");
        Intrinsics.checkNotNullParameter(onSendFailedCallback, "failed");
        Iterator iterator = ((Iterable)CloudConfig.INSTANCE.getUrls()).iterator();
        while (bl2 = iterator.hasNext()) {
            Object object = iterator.next();
            Object object2 = object;
            object2 = (String)object;
            object = this.sendServiceProvider.provideExecutorService();
            Ue1 ue1 = new Ue1(this, event, (String)object2, onSendSuccessCallback, onSendFailedCallback);
            object.execute(ue1);
        }
    }
}

