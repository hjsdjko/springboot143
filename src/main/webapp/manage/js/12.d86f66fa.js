"use strict";(self["webpackChunkvue3_nb0"]=self["webpackChunkvue3_nb0"]||[]).push([[12],{2012:(e,l,n)=>{n.r(l),n.d(l,{default:()=>w});n(1781),n(9939),n(6330),n(4580),n(4371),n(802),n(5440),n(2207),n(4962),n(9029),n(7425),n(8704),n(8623),n(3499),n(8461),n(3068),n(9937),n(3362);var a=n(4401),t=n(8849),u=(n(3711),n(1066)),o=n(6141),i=(n(7549),n(422),n(2097),n(8865),n(9961),{class:"formModel_btn_box"});const r={__name:"formModel",emits:["formModelChange"],setup:function(e,l){var n,t=l.expose,o=l.emit,r=null===(n=(0,a.FN)())||void 0===n?void 0:n.appContext.config.globalProperties,v="menu",d="菜单",c=(0,u.iH)({}),s=(0,u.iH)({menujson:!1}),f=(0,u.iH)(!1),p=(0,u.iH)(!1),m=(0,u.iH)(""),g=(0,u.iH)({menujson:[]}),h=(0,u.iH)(null),_=(0,u.iH)(0),b=(0,u.iH)(""),w=function(){c.value={menujson:""}},k=function(){null===r||void 0===r||r.$http({url:"".concat(v,"/info/").concat(_.value),method:"get"}).then((function(e){new RegExp("../../../file","g");c.value=e.data.data,f.value=!0}))},y=(0,u.iH)(""),H=(0,u.iH)(""),C=(0,u.iH)(""),W=(0,u.iH)(""),j=(0,u.iH)(""),x=function(){var e=arguments.length>0&&void 0!==arguments[0]?arguments[0]:null,l=arguments.length>1&&void 0!==arguments[1]?arguments[1]:"add",n=arguments.length>2&&void 0!==arguments[2]?arguments[2]:"",a=arguments.length>3&&void 0!==arguments[3]?arguments[3]:null,t=arguments.length>4&&void 0!==arguments[4]?arguments[4]:null,u=arguments.length>5&&void 0!==arguments[5]?arguments[5]:null,o=arguments.length>6&&void 0!==arguments[6]?arguments[6]:null,i=arguments.length>7&&void 0!==arguments[7]?arguments[7]:null;if(w(),e&&(_.value=e,b.value=l),"add"==l)p.value=!0,m.value="新增"+d,f.value=!0;else if("info"==l)p.value=!1,m.value="查看"+d,k();else if("edit"==l)p.value=!0,m.value="修改"+d,k();else if("logistics"==l)p.value=!1,m.value="修改物流信息",k();else if("reply"==l)b.value=l,p.value=!0,s.value.cpicture=!0,s.value.content=!0,m.value="回复",k();else if("cross"==l){for(var r in p.value=!0,m.value=n,a)"menujson"!=r||(c.value.menujson=a[r],s.value.menujson=!0);a&&(y.value=a),t&&(H.value=t),o&&(C.value=o),u&&(W.value=u),i&&(j.value=i),f.value=!0}};t({init:x});var $=function(){f.value=!1},U=function(){H.value;var e=JSON.parse(JSON.stringify(y.value)),l="",n="",a="";if("cross"==b.value&&""!=W.value)if(W.value.startsWith("["))l=null===r||void 0===r?void 0:r.$toolUtil.storageGet("userid"),n=e["id"],a=W.value.replace(/\[/,"").replace(/\]/,"");else{for(var t in e)t==W.value&&(e[t]=j.value);M(e)}h.value.validate((function(e){if(e)if(l&&n){c.value.crossuserid=l,c.value.crossrefid=n;var t={page:1,limit:1e3,crossuserid:c.value.crossuserid,crossrefid:c.value.crossrefid};null===r||void 0===r||r.$http({url:"".concat(v,"/page"),method:"get",params:t}).then((function(e){if(e.data.data.total>=a)return null===r||void 0===r||r.$toolUtil.message("".concat(C.value),"error"),!1;null===r||void 0===r||r.$http({url:"".concat(v,"/").concat(c.value.id?"update":"save"),method:"post",data:c.value}).then((function(e){null===r||void 0===r||r.$toolUtil.message("操作成功","success",(function(){f.value=!1,o("formModelChange")}))}))}))}else null===r||void 0===r||r.$http({url:"".concat(v,"/").concat(c.value.id?"update":"save"),method:"post",data:c.value}).then((function(e){null===r||void 0===r||r.$toolUtil.message("操作成功","success",(function(){f.value=!1,o("formModelChange")}))}))}))},M=function(e){null===r||void 0===r||r.$http({url:"".concat(H.value,"/update"),method:"post",data:e}).then((function(e){}))};return function(e,l){var n=(0,a.up)("el-input"),t=(0,a.up)("el-form-item"),u=(0,a.up)("el-col"),o=(0,a.up)("el-row"),r=(0,a.up)("el-form"),v=(0,a.up)("el-button"),d=(0,a.up)("el-dialog");return(0,a.wg)(),(0,a.iD)("div",null,[(0,a.Wm)(d,{modelValue:f.value,"onUpdate:modelValue":l[1]||(l[1]=function(e){return f.value=e}),title:m.value,width:"50%","destroy-on-close":"",fullscreen:!1},(0,a.Nv)({default:(0,a.w5)((function(){return[(0,a.Wm)(r,{class:"formModel_form",ref_key:"formRef",ref:h,model:c.value,"label-width":"$template2.back.add.form.base.labelWidth",rules:g.value},{default:(0,a.w5)((function(){return[(0,a.Wm)(o,null,{default:(0,a.w5)((function(){return[(0,a.Wm)(u,{span:24},{default:(0,a.w5)((function(){return[(0,a.Wm)(t,{label:"菜单",prop:"menujson"},{default:(0,a.w5)((function(){return[(0,a.Wm)(n,{modelValue:c.value.menujson,"onUpdate:modelValue":l[0]||(l[0]=function(e){return c.value.menujson=e}),placeholder:"菜单",type:"textarea",readonly:!(p.value&&!s.value.menujson)},null,8,["modelValue","readonly"])]})),_:1})]})),_:1})]})),_:1})]})),_:1},8,["model","rules"])]})),_:2},[p.value||"logistics"==b.value||"reply"==b.value?{name:"footer",fn:(0,a.w5)((function(){return[(0,a._)("span",i,[(0,a.Wm)(v,{class:"formModel_cancel",onClick:$},{default:(0,a.w5)((function(){return[(0,a.Uk)("取消")]})),_:1}),(0,a.Wm)(v,{class:"formModel_confirm",type:"primary",onClick:U},{default:(0,a.w5)((function(){return[(0,a.Uk)(" 提交 ")]})),_:1})])]})),key:"0"}:void 0]),1032,["modelValue","title"])])}}};var v=n(1059);const d=(0,v.Z)(r,[["__scopeId","data-v-54e8ba36"]]),c=d;var s=function(e){return(0,a.dD)("data-v-2fdd4459"),e=e(),(0,a.Cn)(),e},f={class:"app-contain"},p={class:"list_search_view"},m=s((function(){return(0,a._)("br",null,null,-1)})),g={class:"btn_view"},h=s((function(){return(0,a._)("br",null,null,-1)}));const _={__name:"list",setup:function(e){var l,n=null===(l=(0,a.FN)())||void 0===l?void 0:l.appContext.config.globalProperties,i="menu";(0,o.yj)();(0,a.bv)((function(){}));var r=(0,u.iH)(null),v=(0,u.iH)(null),d=(0,u.iH)({page:1,limit:20,sort:"id",order:"desc"}),s=(0,u.iH)({}),_=(0,u.iH)([]),b=(0,u.iH)(!1),w=function(e){(0,a.Y3)((function(){v.value.clearSelection(),v.value.toggleRowSelection(e)}))},k=function(){b.value=!0;var e=JSON.parse(JSON.stringify(d.value));e["sort"]="id",e["order"]="desc",null===n||void 0===n||n.$http({url:"".concat(i,"/page"),method:"get",params:e}).then((function(e){b.value=!1,r.value=e.data.data.list,H.value=Number(e.data.data.total)}))},y=function(e){_.value=e},H=(0,u.iH)(0),C=(0,u.iH)(["prev","pager","next"]),W=function(e){d.value.limit=e,k()},j=function(e){d.value.page=e,k()},x=function(){d.value.page=d.value.page-1,k()},$=function(){d.value.page=d.value.page+1,k()},U=function(e,l){return null===n||void 0===n?void 0:n.$toolUtil.isAuth(e,l)},M=function(){d.value.page=1,k()},N=(0,u.iH)(null),S=function(){M()},z=function(){_.value.length&&N.value.init(_.value[0].id,"edit")},V=function(){k()};return V(),function(e,l){var n=(0,a.up)("el-form"),u=(0,a.up)("el-button"),o=(0,a.up)("el-table-column"),i=(0,a.up)("el-table"),k=(0,a.up)("el-pagination"),M=(0,a.Q2)("loading");return(0,a.wg)(),(0,a.iD)("div",null,[(0,a._)("div",f,[(0,a._)("div",p,[(0,a.Wm)(n,{model:s.value,class:"search_form"},null,8,["model"]),m,(0,a._)("div",g,[U("menu","修改")?((0,a.wg)(),(0,a.j4)(u,{key:0,type:"primary",disabled:1!=_.value.length,onClick:z},{default:(0,a.w5)((function(){return[(0,a.Uk)("修改")]})),_:1},8,["disabled"])):(0,a.kq)("",!0)])]),h,U("menu","查看")?(0,a.wy)(((0,a.wg)(),(0,a.j4)(i,{key:0,border:"",stripe:!1,onSelectionChange:y,ref_key:"table",ref:v,data:r.value,onRowClick:w},{default:(0,a.w5)((function(){return[(0,a.Wm)(o,{resizable:!0,align:"left","header-align":"left",type:"selection",width:"55"}),(0,a.Wm)(o,{label:"序号",width:"70",resizable:!0,sortable:!0,align:"left","header-align":"left"},{default:(0,a.w5)((function(e){return[(0,a.Uk)((0,t.zw)(e.$index+1),1)]})),_:1}),(0,a.Wm)(o,{label:"操作",width:"300",resizable:!0,sortable:!0,align:"left","header-align":"left"},{default:(0,a.w5)((function(e){return[]})),_:1})]})),_:1},8,["data"])),[[M,b.value]]):(0,a.kq)("",!0),(0,a.Wm)(k,{background:"",layout:C.value.join(","),total:H.value,"page-size":d.value.limit,"prev-text":"上一页","next-text":"下一页","hide-on-single-page":!1,style:{padding:"0",margin:"20px 0 0",whiteSpace:"nowrap",color:"#333",textAlign:"center",width:"100%",fontWeight:"500"},onSizeChange:W,onCurrentChange:j,onPrevClick:x,onNextClick:$},null,8,["layout","total","page-size"])]),(0,a.Wm)(c,{ref_key:"formRef",ref:N,onFormModelChange:S},null,512)])}}},b=(0,v.Z)(_,[["__scopeId","data-v-2fdd4459"]]),w=b}}]);
//# sourceMappingURL=12.d86f66fa.js.map