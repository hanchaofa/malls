<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="include/header.jsp" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<script type="text/javascript">
    var contextPath = "${ctx}";
</script>
<head>
    <link href="${ctx}/res/css/fore/fore_addReview.css" rel="stylesheet"/>
    <title>添加评论 - mall.com-理想生活上Mall商城</title>
    <script>
        $(function () {
            $("#review_form").submit(function () {
                var text = $.trim($("#text-review").val());
                if (text === "") {
                    $(this).css("border", "1px solid #FF0036");
                    return false;
                }
            });
            $("#text-review").focus(function () {
                $("#review_form").css("border", "1px solid #d1ccc8");
            });
        });
    </script>
</head>
<body>
<nav>
    <%@ include file="include/navigator.jsp" %>
</nav>
<div class="header">
    <div id="mallLogo">
        <a href="${ctx}"><img
                src="${ctx}/res/images/fore/WebsiteImage/tmallLogoD.png"></a>
    </div>
    <div class="shopSearchHeader">
        <form action="${ctx}/product" method="get">
            <div class="shopSearchInput">
                <input type="text" class="searchInput" name="productName" placeholder="搜索 商品/品牌/店铺"
                       maxlength="50">
                <input type="submit" value="搜 索" class="searchBtn">
            </div>
        </form>
    </div>
</div>
<div class="content">
    <div class="details_box">
        <div class="db-showpanel">
            <a href="${ctx}/product/${orderItem.productOrderItemProduct.productId}"
               target="_blank"><img
                    src="${ctx}/res/images/item/productSinglePicture/${orderItem.productOrderItemProduct.singleProductImageList[0].productImageSrc}"></a>
        </div>
        <div class="db-icbu">
            <ol class="ui-form-bd">
                <li class="ui-form-row"><h3>${orderItem.productOrderItemProduct.productName}</h3></li>
                <li class="ui-form-row superstar-price">
                    <label class="ui-form-label">价格</label>
                    <div class="ui-form_right">
                        <em>${orderItem.productOrderItemProduct.productSalePrice}</em>
                        <span>元</span>
                    </div>
                </li>
                <li class="ui-from-row">
                    <label class="ui-form-label">配送</label>
                    <div class="ui-form_right"><span class="ul_right_special">快递：0.00</span></div>
                </li>
            </ol>
        </div>
        <div class="banner-totalevolute">
            <div class="tv-leftbox">
                <div class="tv-lb-head"></div>
                <div class="tv-lb-content">
                    <span>累计评价</span>
                    <em class="superstar-ratetotal">${orderItem.productOrderItemProduct.productReviewCount}</em>
                </div>
                <div class="tv-lb-bottom"></div>
            </div>
            <div class="tv-rightbox">
                <div class="tv-rb-cover"></div>
                <div class="tv-rb-bottom"></div>
            </div>
        </div>
        <div class="rate-compose">
            <form method="post" action="${ctx}/review" id="review_form">
                <input type="hidden" class="orderItem_id" value="${orderItem.productOrderItemId}" name="orderItem_id">
                <div class="compose-main">
                    <div class="compose-header">
                        <span>其他买家，需要你的建议哦！</span>
                    </div>
                    <div class="compose-order">
                        <div class="J_rateInputArea">评价商品</div>
                        <div class="text-input-box">
                            <textarea id="text-review" name="reviewContent"></textarea>
                        </div>
                    </div>
                </div>
                <div class="compose-submit">
                    <input type="submit" value="提交评价"/>
                </div>
            </form>
        </div>
    </div>
</div>
<%@include file="include/footer_two.jsp" %>
<%@include file="include/footer.jsp" %>
</body>