package com.stickercamera.app.camera;

import com.stickercamera.app.camera.effect.FilterEffect;
import com.stickercamera.app.camera.util.GPUImageFilterTools;

import java.util.ArrayList;
import java.util.List;


public class EffectService {

    private static EffectService mInstance;

    public static EffectService getInst() {
        if (mInstance == null) {
            synchronized (EffectService.class) {
                if (mInstance == null)
                    mInstance = new EffectService();
            }
        }
        return mInstance;
    }

    private EffectService() {
    }

    public List<FilterEffect> getLocalFilters() {
        List<FilterEffect> filters = new ArrayList<FilterEffect>();
        filters.add(new FilterEffect("NORMAL", GPUImageFilterTools.FilterType.NORMAL, 0));

        filters.add(new FilterEffect("AIMEI", GPUImageFilterTools.FilterType.ACV_AIMEI, 0));
        filters.add(new FilterEffect("DANLAN", GPUImageFilterTools.FilterType.ACV_DANLAN, 0));
        filters.add(new FilterEffect("DANHUA", GPUImageFilterTools.FilterType.ACV_DANHUANG, 0));
        filters.add(new FilterEffect("FUGU", GPUImageFilterTools.FilterType.ACV_FUGU, 0));
        filters.add(new FilterEffect("GAOLEN", GPUImageFilterTools.FilterType.ACV_GAOLENG, 0));
        filters.add(new FilterEffect("HUAIJIU", GPUImageFilterTools.FilterType.ACV_HUAIJIU, 0));
        filters.add(new FilterEffect("JIAOPIA", GPUImageFilterTools.FilterType.ACV_JIAOPIAN, 0));
        filters.add(new FilterEffect("KEAI", GPUImageFilterTools.FilterType.ACV_KEAI, 0));
        filters.add(new FilterEffect("LOMO", GPUImageFilterTools.FilterType.ACV_LOMO, 0));
        filters.add(new FilterEffect("MORENJ", GPUImageFilterTools.FilterType.ACV_MORENJIAQIANG, 0));
        filters.add(new FilterEffect("NUANXI", GPUImageFilterTools.FilterType.ACV_NUANXIN, 0));
        filters.add(new FilterEffect("QINGXI", GPUImageFilterTools.FilterType.ACV_QINGXIN, 0));
        filters.add(new FilterEffect("RIXI", GPUImageFilterTools.FilterType.ACV_RIXI, 0));
        filters.add(new FilterEffect("WENNU", GPUImageFilterTools.FilterType.ACV_WENNUAN, 0));

        return filters;
    }

}
