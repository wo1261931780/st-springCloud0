package wo1261931780.feignApi.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Intellij IDEA.
 * Project:testSpringCloud
 * Package:wo1261931780.userService.pojo
 *
 * @author liujiajun_junw
 * @Date 2023-10-20-14  星期二
 * @Description
 */

@ApiModel(description = "tb_order")
@Schema
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TbOrder implements Serializable {
	/**
	 * 订单id
	 */
	@ApiModelProperty(value = "订单id")
	@Schema(description = "订单id")
	private Long id;

	/**
	 * 用户id
	 */
	@ApiModelProperty(value = "用户id")
	@Schema(description = "用户id")
	private Long userId;

	/**
	 * 商品名称
	 */
	@ApiModelProperty(value = "商品名称")
	@Schema(description = "商品名称")
	private String name;

	/**
	 * 商品价格
	 */
	@ApiModelProperty(value = "商品价格")
	@Schema(description = "商品价格")
	private Long price;

	/**
	 * 商品数量
	 */
	@ApiModelProperty(value = "商品数量")
	@Schema(description = "商品数量")
	private Integer num;

	@Serial
	private static final long serialVersionUID = 1L;
}
