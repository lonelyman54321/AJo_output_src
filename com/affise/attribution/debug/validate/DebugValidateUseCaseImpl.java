/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.debug.validate;

import com.affise.attribution.converter.ProvidersToJsonStringConverter;
import com.affise.attribution.debug.validate.DebugOnValidateCallback;
import com.affise.attribution.debug.validate.DebugValidateUseCase;
import com.affise.attribution.debug.validate.DebugValidateUseCaseImpl$Companion;
import com.affise.attribution.debug.validate.DebugValidateUseCaseImpl$validate$1$1;
import com.affise.attribution.debug.validate.ValidationStatus;
import com.affise.attribution.executors.ExecutorServiceProvider;
import com.affise.attribution.init.AffiseInitProperties;
import com.affise.attribution.logs.LogsManager;
import com.affise.attribution.network.CloudConfig;
import com.affise.attribution.network.HttpClient;
import com.affise.attribution.network.HttpClient$DefaultImpls;
import com.affise.attribution.network.HttpClient$Method;
import com.affise.attribution.network.HttpResponse;
import com.affise.attribution.parameters.factory.PostBackModelFactory;
import java.net.URL;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class DebugValidateUseCaseImpl
implements DebugValidateUseCase {
    private static final int ATTEMPTS_TO_SEND = 2;
    public static final DebugValidateUseCaseImpl$Companion Companion;
    private static final String INVALID_APP_ID = "Invalid affise_app_id";
    private static final String INVALID_CHECK_SUM = "Failed to get application or check sum";
    private static final String KEY = "message";
    private static final String PACKAGE_NAME_NOT_FOUND = "Package name not found";
    public static final String PATH = "postback/validate";
    private static final long TIME_DELAY_SENDING = 5000L;
    private final ProvidersToJsonStringConverter converter;
    private final HttpClient httpClient;
    private final AffiseInitProperties initProperties;
    private final LogsManager logsManager;
    private final List providers;
    private final ExecutorServiceProvider sendServiceProvider;
    private final String url;

    static {
        DebugValidateUseCaseImpl$Companion debugValidateUseCaseImpl$Companion;
        Companion = debugValidateUseCaseImpl$Companion = new DebugValidateUseCaseImpl$Companion(null);
    }

    public DebugValidateUseCaseImpl(PostBackModelFactory object, AffiseInitProperties affiseInitProperties, LogsManager logsManager2, HttpClient httpClient2, ExecutorServiceProvider executorServiceProvider, ProvidersToJsonStringConverter providersToJsonStringConverter2) {
        Intrinsics.checkNotNullParameter(object, "postBackModelFactory");
        Intrinsics.checkNotNullParameter(affiseInitProperties, "initProperties");
        Intrinsics.checkNotNullParameter(logsManager2, "logsManager");
        Intrinsics.checkNotNullParameter(httpClient2, "httpClient");
        Intrinsics.checkNotNullParameter(executorServiceProvider, "sendServiceProvider");
        Intrinsics.checkNotNullParameter(providersToJsonStringConverter2, "converter");
        this.initProperties = affiseInitProperties;
        this.logsManager = logsManager2;
        this.httpClient = httpClient2;
        this.sendServiceProvider = executorServiceProvider;
        this.converter = providersToJsonStringConverter2;
        this.providers = object = ((PostBackModelFactory)object).getRequestProviders();
        this.url = object = CloudConfig.INSTANCE.getURL(PATH);
    }

    public static /* synthetic */ void a(DebugValidateUseCaseImpl debugValidateUseCaseImpl, DebugOnValidateCallback debugOnValidateCallback) {
        DebugValidateUseCaseImpl.validate$lambda$0(debugValidateUseCaseImpl, debugOnValidateCallback);
    }

    private final HttpResponse createRequest() {
        HttpClient httpClient2 = this.httpClient;
        Object object = this.url;
        URL uRL = new URL((String)object);
        object = HttpClient$Method.POST;
        Object object2 = this.converter;
        Object object3 = this.providers;
        object2 = ((ProvidersToJsonStringConverter)object2).convert((List)object3);
        object3 = CloudConfig.INSTANCE.getHeaders();
        return HttpClient$DefaultImpls.executeRequest$default(httpClient2, uRL, (HttpClient$Method)((Object)object), (String)object2, (Map)object3, false, 16, null);
    }

    /*
     * Exception decompiling
     */
    private final ValidationStatus getValidationStatus(HttpResponse var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 2[TRYBLOCK] [2 : 40->45)] java.lang.Exception
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private final void sendWithRepeat(DebugOnValidateCallback debugOnValidateCallback, Function0 function0) {
        int n3 = 2;
        boolean bl2 = false;
        while (n3 != 0 && !bl2) {
            Object object = this.createRequest();
            if ((object = this.getValidationStatus((HttpResponse)object)) != null) {
                debugOnValidateCallback.handle((ValidationStatus)((Object)object));
                bl2 = true;
                continue;
            }
            if ((n3 += -1) == 0) {
                object = ValidationStatus.NETWORK_ERROR;
                debugOnValidateCallback.handle((ValidationStatus)((Object)object));
                continue;
            }
            function0.invoke();
        }
    }

    private static final void validate$lambda$0(DebugValidateUseCaseImpl debugValidateUseCaseImpl, DebugOnValidateCallback debugOnValidateCallback) {
        Intrinsics.checkNotNullParameter(debugValidateUseCaseImpl, "this$0");
        Intrinsics.checkNotNullParameter(debugOnValidateCallback, "$onComplete");
        DebugValidateUseCaseImpl$validate$1$1 debugValidateUseCaseImpl$validate$1$1 = DebugValidateUseCaseImpl$validate$1$1.INSTANCE;
        debugValidateUseCaseImpl.sendWithRepeat(debugOnValidateCallback, debugValidateUseCaseImpl$validate$1$1);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void validate(DebugOnValidateCallback debugOnValidateCallback) {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                Object object = "onComplete";
                try {
                    Intrinsics.checkNotNullParameter(debugOnValidateCallback, (String)object);
                    object = this.initProperties;
                    boolean bl2 = ((AffiseInitProperties)object).isProduction();
                    if (bl2) {
                        object = ValidationStatus.NOT_WORKING_ON_PRODUCTION;
                        debugOnValidateCallback.handle((ValidationStatus)((Object)object));
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                object = this.sendServiceProvider;
                object = object.provideExecutorService();
                ti0_0 ti0_02 = new ti0_0(this, debugOnValidateCallback);
                object.execute(ti0_02);
                return;
            }
            throw throwable2;
        }
    }
}

