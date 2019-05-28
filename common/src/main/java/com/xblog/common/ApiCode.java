package com.xblog.common;

public enum ApiCode {

	/**
	 * 请求成功
	 */
	SUCCESS("200"),

	/**
	 * key错误
	 */
	AUTH_KEY_ERROR("401.3"),

	/**
	 * 服务端异常，发生错误
	 */
	SYS_EXCEPTION("500"),

	/**
	 * HTT请求方法不被允许
	 */
	UNSPORT_METHOD("405"),

	/**
	 * 必要参数缺失
	 */
	PARAM_MISSING("400"),

	/**
	 * 未登录
	 */
	NOTLOGIN("401"),


	/**
	 * 未注册
	 */
	NOTREGIST("402"),

	/**
	 * 验证错误
	 */
	VALIDATION_ERROR("4021"),

	/**
	 * 未找到对象数据
	 */
	NOT_FOUND("404"),

	/**
	 * 提供查重提交返回的code
	 */
	/**
	 * task验证错误
	 */
	TASK_ERORR("5401"),

	/**
	 * 免费次数用完
	 */
	RUN_OUT("5402"),

	/**
	 * 余额不足
	 */
	NO_BALANCE("5403"),

	/**
	 * 已经下载过
	 */
	HAS_DOWNLOAD("5404"),

	/**
	 * 不是VIP
	 */
	NOT_VIP("5405");

	private String code;

	private ApiCode(String code) {
		this.code = code;
	}

	public String code() {
		return this.code;
	}

}
