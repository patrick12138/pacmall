package com.patrick.pacmall.product.vo.skuItemvo;

import com.patrick.pacmall.product.vo.spvsavevo.Attr;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class SpuItemAttrGroupVo {
    private String groupName;
    private List<Attr> attrValues;
}
