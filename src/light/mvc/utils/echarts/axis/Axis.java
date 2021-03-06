/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 abel533@gmail.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package light.mvc.utils.echarts.axis;

import java.util.ArrayList;
import java.util.Arrays;

import light.mvc.utils.echarts.AbstractData;
import light.mvc.utils.echarts.Component;
import light.mvc.utils.echarts.code.AxisType;
import light.mvc.utils.echarts.code.NameLocation;
import light.mvc.utils.echarts.code.X;
import light.mvc.utils.echarts.code.Y;
import light.mvc.utils.echarts.style.LineStyle;

/**
 * 坐标轴
 *
 * @author liuzh
 */
public abstract class Axis<T> extends AbstractData<T> implements Component {
    /**
     * 是否显示
     */
    private Boolean show;
    /**
     * 坐标轴类型，横轴默认为类目型'category'，纵轴默认为数值型'value'
     *
     * @see com.github.abel533.echarts.code.AxisType
     */
    private AxisType type;
    /**
     * 坐标轴类型，横轴默认为类目型'bottom'，纵轴默认为数值型'left'，可选为：'bottom' | 'top' | 'left' | 'right'
     *
     * @see com.github.abel533.echarts.code.X
     * @see com.github.abel533.echarts.code.Y
     */
    private Object position;
    /**
     * 坐标轴名称，默认为空
     */
    private String name;
    /**
     * 坐标轴名称位置，默认为'end'，可选为：'start' | 'end'
     *
     * @see com.github.abel533.echarts.code.NameLocation
     */
    private NameLocation nameLocation;
    /**
     * 坐标轴名称文字样式，默认取全局配置，颜色跟随axisLine主色，可设
     */
    private LineStyle nameTextStyle;

    /**
     * 坐标轴线，默认显示，属性show控制显示与否，属性lineStyle（详见lineStyle）控制线条样式
     *
     * @see com.github.abel533.echarts.axis.AxisLine
     * @see com.github.abel533.echarts.style.LineStyle
     */
    private AxisLine axisLine;
    /**
     * 坐标轴小标记，默认不显示，属性show控制显示与否，属性length控制线长，属性lineStyle（详见lineStyle）控制线条样式
     *
     * @see com.github.abel533.echarts.axis.AxisTick
     * @see com.github.abel533.echarts.style.LineStyle
     */
    private AxisTick axisTick;
    /**
     * 坐标轴文本标签，详见axis.axisLabel
     *
     * @see com.github.abel533.echarts.axis.AxisLabel
     */
    private AxisLabel axisLabel;
    /**
     * 分隔线，默认显示，属性show控制显示与否，属性lineStyle（详见lineStyle）控制线条样式
     *
     * @see com.github.abel533.echarts.axis.SplitLine
     */
    private SplitLine splitLine;
    /**
     * 分隔区域，默认不显示，属性show控制显示与否，属性areaStyle（详见areaStyle）控制区域样式
     */
    private SplitArea splitArea;

    /**
     * 获取show值
     */
    public Boolean show() {
        return this.show;
    }

    /**
     * 设置show值
     *
     * @param show
     */
    public T show(Boolean show) {
        this.show = show;
        return (T) this;
    }

    /**
     * 获取type值
     */
    public AxisType type() {
        return this.type;
    }

    /**
     * 获取type值
     */
    public AxisType getType() {
        return type;
    }

    /**
     * 设置type值
     *
     * @param type
     */
    public void setType(AxisType type) {
        this.type = type;
    }

    /**
     * 获取position值
     */
    public Object getPosition() {
        return position;
    }

    /**
     * 设置position值
     *
     * @param position
     */
    public void setPosition(Object position) {
        this.position = position;
    }

    /**
     * 获取name值
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name值
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取nameLocation值
     */
    public NameLocation getNameLocation() {
        return nameLocation;
    }

    /**
     * 设置nameLocation值
     *
     * @param nameLocation
     */
    public void setNameLocation(NameLocation nameLocation) {
        this.nameLocation = nameLocation;
    }

    /**
     * 设置type值
     *
     * @param type
     */
    public T type(AxisType type) {
        this.type = type;
        return (T) this;

    }

    /**
     * 获取position值
     */
    public Object position() {
        return this.position;
    }

    /**
     * 设置position值
     *
     * @param position
     */
    public T position(Object position) {
        this.position = position;
        return (T) this;
    }

    /**
     * 设置position值
     *
     * @param position
     */
    public T position(X position) {
        this.position = position;
        return (T) this;
    }

    /**
     * 设置position值
     *
     * @param position
     */
    public T position(Y position) {
        this.position = position;
        return (T) this;
    }

    /**
     * 获取name值
     */
    public String name() {
        return this.name;
    }

    /**
     * 设置name值
     *
     * @param name
     */
    public T name(String name) {
        this.name = name;
        return (T) this;
    }

    /**
     * 获取nameLocation值
     */
    public NameLocation nameLocation() {
        return this.nameLocation;
    }

    /**
     * 设置nameLocation值
     *
     * @param nameLocation
     */
    public T nameLocation(NameLocation nameLocation) {
        this.nameLocation = nameLocation;
        return (T) this;
    }

    /**
     * 坐标轴名称文字样式，默认取全局配置，颜色跟随axisLine主色，可设
     */
    public LineStyle nameTextStyle() {
        if (this.nameTextStyle == null) {
            this.nameTextStyle = new LineStyle();
        }
        return this.nameTextStyle;
    }

    /**
     * 设置style值
     *
     * @param style
     */
    public T nameTextStyle(LineStyle style) {
        this.nameTextStyle = style;
        return (T) this;
    }

    /**
     * 坐标轴线，默认显示，属性show控制显示与否，属性lineStyle（详见lineStyle）控制线条样式
     *
     * @see com.github.abel533.echarts.axis.AxisLine
     * @see com.github.abel533.echarts.style.LineStyle
     */
    public AxisLine axisLine() {
        if (this.axisLine == null) {
            this.axisLine = new AxisLine();
        }
        return this.axisLine;
    }

    /**
     * 设置axisLine值
     *
     * @param axisLine
     */
    public T axisLine(AxisLine axisLine) {
        this.axisLine = axisLine;
        return (T) this;
    }

    /**
     * 坐标轴小标记，默认不显示，属性show控制显示与否，属性length控制线长，属性lineStyle（详见lineStyle）控制线条样式
     *
     * @see com.github.abel533.echarts.axis.AxisTick
     * @see com.github.abel533.echarts.style.LineStyle
     */
    public AxisTick axisTick() {
        if (this.axisTick == null) {
            this.axisTick = new AxisTick();
        }
        return this.axisTick;
    }

    /**
     * 设置axisTick值
     *
     * @param axisTick
     */
    public T axisTick(AxisTick axisTick) {
        this.axisTick = axisTick;
        return (T) this;
    }

    /**
     * 坐标轴文本标签，详见axis.axisLabel
     *
     * @see com.github.abel533.echarts.axis.AxisLabel
     */
    public AxisLabel axisLabel() {
        if (this.axisLabel == null) {
            this.axisLabel = new AxisLabel();
        }
        return this.axisLabel;
    }

    /**
     * @param label
     * @return
     */
    public T axisLabel(AxisLabel label) {
        this.axisLabel = label;
        return (T) this;
    }


    /**
     * 分隔线，默认显示，属性show控制显示与否，属性lineStyle（详见lineStyle）控制线条样式
     *
     * @see com.github.abel533.echarts.axis.SplitLine
     */
    public SplitLine splitLine() {
        if (this.splitLine == null) {
            this.splitLine = new SplitLine();
        }
        return this.splitLine;
    }

    /**
     * 设置splitLine值
     *
     * @param splitLine
     */
    public T splitLine(SplitLine splitLine) {
        if (this.splitLine == null) {
            this.splitLine = splitLine;
        }
        return (T) this;
    }

    /**
     * 分隔区域，默认不显示，属性show控制显示与否，属性areaStyle（详见areaStyle）控制区域样式
     */
    public SplitArea splitArea() {
        if (this.splitArea == null) {
            this.splitArea = new SplitArea();
        }
        return this.splitArea;
    }

    /**
     * 设置splitArea值
     *
     * @param splitArea
     */
    public T splitArea(SplitArea splitArea) {
        this.splitArea = splitArea;
        return (T) this;
    }

    /**
     * 添加坐标轴的类目属性
     *
     * @param values
     * @return
     */
    public T data(Object... values) {
        if (values == null || values.length == 0) {
            return (T) this;
        }
        if (this.data == null) {
            if (this.type == AxisType.category) {
                data = new ArrayList<Object>();
            } else {
                throw new RuntimeException("数据轴不能添加类目信息!");
            }
        }
        this.data.addAll(Arrays.asList(values));
        return (T) this;
    }

    /**
     * 获取show值
     */
    public Boolean getShow() {
        return show;
    }

    /**
     * 设置show值
     *
     * @param show
     */
    public void setShow(Boolean show) {
        this.show = show;
    }

    /**
     * 获取nameTextStyle值
     */
    public LineStyle getNameTextStyle() {
        return nameTextStyle;
    }

    /**
     * 设置nameTextStyle值
     *
     * @param nameTextStyle
     */
    public void setNameTextStyle(LineStyle nameTextStyle) {
        this.nameTextStyle = nameTextStyle;
    }

    /**
     * 获取axisLine值
     */
    public AxisLine getAxisLine() {
        return axisLine;
    }

    /**
     * 设置axisLine值
     *
     * @param axisLine
     */
    public void setAxisLine(AxisLine axisLine) {
        this.axisLine = axisLine;
    }

    /**
     * 获取axisTick值
     */
    public AxisTick getAxisTick() {
        return axisTick;
    }

    /**
     * 设置axisTick值
     *
     * @param axisTick
     */
    public void setAxisTick(AxisTick axisTick) {
        this.axisTick = axisTick;
    }

    /**
     * 获取axisLabel值
     */
    public AxisLabel getAxisLabel() {
        return axisLabel;
    }

    /**
     * 设置axisLabel值
     *
     * @param axisLabel
     */
    public void setAxisLabel(AxisLabel axisLabel) {
        this.axisLabel = axisLabel;
    }

    /**
     * 获取splitLine值
     */
    public SplitLine getSplitLine() {
        return splitLine;
    }

    /**
     * 设置splitLine值
     *
     * @param splitLine
     */
    public void setSplitLine(SplitLine splitLine) {
        this.splitLine = splitLine;
    }

    /**
     * 获取splitArea值
     */
    public SplitArea getSplitArea() {
        return splitArea;
    }

    /**
     * 设置splitArea值
     *
     * @param splitArea
     */
    public void setSplitArea(SplitArea splitArea) {
        this.splitArea = splitArea;
    }
}
