			layui.use([ 'element', 'jquery', 'table','form', 'layedit', 'laydate'], function(){
			  var $ = layui.jquery
			  ,element = layui.element //Tab的切换功能，切换事件监听等，需要依赖element模块
			  ,form = layui.form
			  ,table = layui.table
			  ,layer = layui.layer
			  ,layedit = layui.layedit
			  ,laydate = layui.laydate;
			  

			  //方法级渲染
			  table.render({
				elem: '#taskall',
				url: '../datajson/taskall.json',
				
				cols: [[
				  {checkbox: true, fixed: true}
				  ,{field:'a_classification', title: '业务类型',width:140, sort: true}
				  ,{field:'a_business', title: '业务单号', width:180, sort: true}
				  ,{field:'a_username', title: '企业主体', width:200}
				  ,{field:'a_seque', title: '封单状态', width:120}
				  ,{field:'a_examine', title: '调阅审核', width:120}
				  ,{field:'a_source', title: '任务创建方式', width:120}
				  ,{field:'a_images', title: '影像状态', width:120}
				  ,{field:'a_imgsource', title: '影像采集来源', width:120}
				  ,{field:'a_mentionn', title: '提单人编号', width:120}
				  ,{field:'a_mention', title: '提单人', width:120}
				  ,{field:'a_mentiont', title: '提单时间', width:140}
				  ,{field:'a_state', title: '任务状态', sort: true, width:120}
				  ,{field:'a_remarks', title: '备注'}
				  ,{field:'a_id', title: '任务流水号', width:120}
				  ,{field:'operation', title: '操作', toolbar: '#all_tasks_operation', width:150, fixed: 'right'}
				]]
				,id: 'testReload'
				,page: true
				
			  });
			   //监听行工具事件
                table.on('tool(all_tasks)', function(obj){
                    var data = obj.data;
                    var id=data.id;
                    if(obj.event === 'detail'){
                        element.tabChange('tab1', '2');
                        getDtails(id);
                        getTaskList(id);

                    }
                });
			  
			  $(".isShow").show();
			  table.render({
				elem: '#invItemDiv',
				url: '../datajson/imagetext.json',
				toolbar: '#tool_invItemDiv',
				cols: [[
				  {checkbox: true, fixed: true}
				  ,{field:'invItemGrid_id', title: '序号', width:80, sort: true, fixed: true}
				  ,{field:'invItemGrid_itemName', title: '名称', width:140}
				  ,{field:'jqgh_invItemGrid_itemSpec', title: '规格型号', width:160}
				  ,{field:'jqgh_invItemGrid_unit', title: '单位', width:220}
				  ,{field:'jqgh_invItemGrid_itemQuantity', title: '数量', width:80}
				  ,{field:'jqgh_invItemGrid_itemPrice', title: '单价', sort: true, width:120}
				  ,{field:'jqgh_invItemGrid_itemAmount', title: '金额', width:120}
				  ,{field:'jqgh_invItemGrid_itemTaxRate', title: '税率', width:80}
				  ,{field:'jqgh_invItemGrid_itemTax', title: '税额', width:120}
				  ,{field:'jqgh_invItemGrid_undefined', title: '操作', toolbar: '#bar_invItemDiv', width:120}
				]]
				,id: 'testReload'
				,page: true
				
			  });
			  $(".isShow").hide();
			  table.on('toolbar(tool_invItemDiv)', function(obj){
				
			  });
			  
			  table.render({
				elem: '#detailed_task',
				url: '../datajson/invoicedata.json',
				toolbar: '#tool_detailed_task',
				cols: [[
				  {checkbox: true, fixed: true}
				  ,{field:'edocNo', title: '业务单号', width:220, sort: true, fixed: true}
				  ,{field:'bizTypeCode', title: '业务类型', width:180}
				  ,{field:'billTypeCode', title: '文件类型', width:180}
				  ,{field:'collecttime', title: '采集时间', width:180}
				  ,{field:'platform', title: '可平台验真', width:180}
				  ,{field:'invCode', title: '发票代码', width:160}
				  ,{field:'invNo', title: '发票号码', width:180}
				  ,{field:'invDate', title: '发票日期', sort: true, width:180}
				  ,{field:'checkcode', title: '校验码（后六位）', width:140}
				  ,{field:'truestate', title: '验真状态', width:160}
				  ,{field:'trueresuits', title: '验真结果', width:160}
				  ,{field:'truesummary', title: '验真摘要', width:220}
				  ,{field:'truetime', title: '验真日期', width:180}
				  ,{field:'authstate', title: '认证状态', width:160}
				  ,{field:'authresuits', title: '认证结果', width:160}
				  ,{field:'authsummary', title: '认证摘要', width:220}
				  ,{field:'authtime', title: '认证时间', width:180}
				  ,{field:'bankauth', title: '抵账库认证结果', width:180}
				  ,{field:'bankmatch', title: '抵账库匹配', width:180}
				  ,{field:'matchtime', title: '认证所属期', width:180}
				  ,{field:'buyerName', title: '购方名称', width:220}
				  ,{field:'buyerTaxCode', title: '购方税号', width:220}
				  ,{field:'salerName', title: '销方名称', width:220}
				  ,{field:'salerTaxCode', title: '销方税号', width:220}
				  ,{field:'invAmount', title: '金额（未税）', sort: true, width:140}
				  ,{field:'invTax', title: '税额', width:140}
				  ,{field:'invTotal', title: '价税合计', width:140}
				  ,{field:'remarks', title: '备注', width:160}
				]]
				
				,page: true
				
			  });
			
			  //监听行单击事件（单击事件为：rowDouble）
			  table.on('row(detailed_task)', function(obj){
			
				var data = obj.data;
				layer.open ({
				  title:false
				  ,area: ['1101px', '600px']
				  ,content:$('#detailed_task_eject').html()
				});
				
			  });
			  
			  table.render({
				elem: '#income_detailed',
				url: '../datajson/invoicedata.json',
				toolbar: '#tool_detailed_task',
				cols: [[
				  {checkbox: true, fixed: true}
				  ,{field:'edocNo', title: '业务单号', width:220, sort: true, fixed: true}
				  ,{field:'collecttime', title: '采集时间', width:180}
				  ,{field:'collectsource', title: '发票来源', width:180}
				  ,{field:'platform', title: '可平台验真', width:180}
				  ,{field:'invCode', title: '发票代码', width:160}
				  ,{field:'invNo', title: '发票号码', width:180}
				  ,{field:'invDate', title: '发票日期', sort: true, width:180}
				  ,{field:'checkcode', title: '校验码（后六位）', width:140}
				  ,{field:'truestate', title: '验真状态', width:160}
				  ,{field:'trueresuits', title: '验真结果', width:160}
				  ,{field:'truesummary', title: '验真摘要', width:220}
				  ,{field:'truetime', title: '验真日期', width:180}
				  ,{field:'buyerName', title: '购方名称', width:220}
				  ,{field:'buyerTaxCode', title: '购方税号', width:220}
				  ,{field:'salerName', title: '销方名称', width:220}
				  ,{field:'salerTaxCode', title: '销方税号', width:220}
				  ,{field:'invAmount', title: '金额（未税）', sort: true, width:140}
				  ,{field:'invTax', title: '税额', width:140}
				  ,{field:'invTotal', title: '价税合计', width:140}
				  ,{field:'remarks', title: '备注', width:160}
				  ,{field:'bizTypeCode', title: '业务类型', width:180}
				  ,{field:'billTypeCode', title: '文件类型', width:180}
				]]
				
				,page: true
				
			  });
			
			  //监听行单击事件（单击事件为：rowDouble）
			  table.on('row(detailed_task)', function(obj){
			
				var data = obj.data;
				layer.open ({
				  title:false
				  ,area: ['1101px', '600px']
				  ,content:$('#detailed_task_eject').html()
				});
				
			  });
			  
			  table.render({
				elem: '#taskagency',
				url: '../datajson/taskagency.json',
				cols: [[
				  {checkbox: true, fixed: true}
				  ,{field:'jqgh_todoTaskGrid_edocNo', title: '单证编号', sort: true, fixed: true}
				  ,{field:'jqgh_todoTaskGrid_edocTaskStatus', title: '影像状态', width:220}
				  ,{field:'jqgh_todoTaskGrid_sysFlag', title: '数据来源', width:220}
				  ,{field:'jqgh_todoTaskGrid_edocType', title: '业务类型', width:220}
				  ,{field:'jqgh_todoTaskGrid_taskCreateTime', title: '创建时间', width:280}
				]]
				,id: 'testReload'
				,page: true
				
			  });
			  table.render({
				elem: '#taskcomp',
				url: '../datajson/taskcomp.json',
				cols: [[
				  {checkbox: true, fixed: true}
				  ,{field:'jqgh_workDoneGrid_edocNo', title: '单证编号', sort: true, fixed: true}
				  ,{field:'jqgh_workDoneGrid_taskName', title: '任务名称', width:220}
				  ,{field:'jqgh_workDoneGrid_taskAssingee', title: '任务责任人', width:220}
				  ,{field:'jqgh_workDoneGrid_edocType', title: '单证类型', width:220}
				  ,{field:'jqgh_workDoneGrid_createTime', title: '创建时间', width:280}
				  ,{field:'jqgh_workDoneGrid_description', title: '任务描述', width:280}
				]]
				,id: 'testReload'
				,page: true
				
			  });
			  table.render({
				elem: '#invpool',
				url: '../datajson/invpool.json',
				cols: [[
				  {checkbox: true, fixed: true}
				  ,{field:'jqgh_invoiceGrid_invType', title: '发票类型', width:220, sort: true, fixed: true}
				  ,{field:'jqgh_invoiceGrid_invCode', title: '发票代码', width:220}
				  ,{field:'jqgh_invoiceGrid_invNo', title: '发票号码', width:220}
				  ,{field:'jqgh_invoiceGrid_invDate', title: '发票日期', width:220}
				  ,{field:'jqgh_invoiceGrid_invAmount', title: '金额', width:160}
				  ,{field:'jqgh_invoiceGrid_invTax', title: '税额', width:160}
				  ,{field:'jqgh_invoiceGrid_invTotal', title: '价税合计', width:160}
				  ,{field:'jqgh_invoiceGrid_buyerTaxCode', title: '购方公司税号', width:280}
				  ,{field:'jqgh_invoiceGrid_buyerName', title: '购方公司名称', width:280}
				  ,{field:'jqgh_invoiceGrid_salerTaxCode', title: '销方公司税号', width:280}
				  ,{field:'jqgh_invoiceGrid_salerName', title: '销方公司名称', width:280}
				  ,{field:'jqgh_invoiceGrid_checkStatus', title: '规则校验结果', width:220}
				  ,{field:'jqgh_invoiceGrid_extField1', title: '冲突单据', width:220}
				  ,{field:'jqgh_invoiceGrid_checkDetails', title: '真伪校验结果', width:220}
				  ,{field:'jqgh_invoiceGrid_checkTime', title: '真伪校验时间', width:220}
				  ,{field:'jqgh_invoiceGrid_extField2', title: '真伪校验描述', width:280}
				  ,{field:'jqgh_invoiceGrid_undefined', title: '操作', width:220}
				]]
				,id: 'testReload'
				,page: true
				
			  });
			  table.render({
				elem: '#inputtax',
				url: '../datajson/inputtax.json',
				cols: [[
				  {checkbox: true, fixed: true}
				  ,{field:'jqgh_invoiceGrid_edocNo', title: '单据编码', width:220, sort: true, fixed: true}
				  ,{field:'jqgh_invoiceGrid_costType', title: '费用类型', width:220}
				  ,{field:'jqgh_invoiceGrid_invNo', title: '部门', width:220}
				  ,{field:'jqgh_invoiceGrid_invDate', title: '发票类型', width:220}
				  ,{field:'jqgh_invoiceGrid_invAmount', title: '发票代码', width:160}
				  ,{field:'jqgh_invoiceGrid_invTax', title: '发票号码', width:160}
				  ,{field:'jqgh_invoiceGrid_invDate', title: '开票日期', width:160}
				  ,{field:'jqgh_invoiceGrid_buyerName', title: '购方公司名称', width:280}
				  ,{field:'jqgh_invoiceGrid_buyerTaxCode', title: '购方公司税号', width:280}
				  ,{field:'jqgh_invoiceGrid_salerName', title: '销方公司名称', width:280}
				  ,{field:'jqgh_invoiceGrid_salerTaxCode', title: '销方公司税号', width:280}
				  ,{field:'jqgh_invoiceGrid_invAmount', title: '不含税金额', width:220}
				  ,{field:'jqgh_invoiceGrid_invTax', title: '税额', width:220}
				  ,{field:'jqgh_invoiceGrid_invTotal', title: '价税合计', width:220}
				  ,{field:'jqgh_invoiceGrid_remarks', title: '备注栏', width:220}
				  ,{field:'jqgh_invoiceGrid_checkDetails', title: '验真结果', width:280}
				  ,{field:'jqgh_invoiceGrid_checkCertification', title: '认证结果', width:220}
				  ,{field:'jqgh_invoiceGrid_extField3', title: '实际报销价税', width:280}
				  ,{field:'jqgh_invoiceGrid_extField5', title: '实际报销税额', width:220}
				]]
				,id: 'testReload'
				,page: true
				
			  });
			  table.render({
				elem: '#invoice_pool',
				url: '../datajson/invoicedata.json',
				toolbar: '#invoice_pool',
				cols: [[
				  {checkbox: true, fixed: true}
				  ,{field:'edocNo', title: '业务单号', width:220, sort: true, fixed: true}
				  ,{field:'bizTypeCode', title: '业务类型', width:180}
				  ,{field:'billTypeCode', title: '单证类型', width:180}
				  ,{field:'importsales', title: '发票来源', width:180}
				  ,{field:'invCode', title: '发票代码', width:160}
				  ,{field:'invNo', title: '发票号码', width:180}
				  ,{field:'invDate', title: '发票日期', sort: true, width:180}
				  ,{field:'checkcode', title: '校验码（后六位）', width:140}
				  ,{field:'truestate', title: '验真状态', width:160}
				  ,{field:'trueresuits', title: '验真结果', width:160}
				  ,{field:'truesummary', title: '验真摘要', width:220}
				  ,{field:'authstate', title: '认证状态', width:160}
				  ,{field:'authresuits', title: '认证结果', width:160}
				  ,{field:'authsummary', title: '认证摘要', width:220}
				  ,{field:'bankauth', title: '抵账库认证结果', width:180}
				  ,{field:'bankmatch', title: '抵账库匹配', width:180}
				  ,{field:'buyerName', title: '购方名称', width:220}
				  ,{field:'buyerTaxCode', title: '购方税号', width:220}
				  ,{field:'salerName', title: '销方名称', width:220}
				  ,{field:'salerTaxCode', title: '销方税号', width:220}
				  ,{field:'invAmount', title: '金额（不含税）', sort: true, width:140}
				  ,{field:'invTax', title: '税额', width:140}
				  ,{field:'invTotal', title: '价税合计', width:140}
				  ,{field:'remarks', title: '备注', width:160}
				]]
				
				,page: true
			  });
			  table.render({
				elem: '#config_image',
				url: '../datajson/configimg.json',
				toolbar:'#b_config_image',
				cols: [[
				  {checkbox: true, fixed: true}
				  ,{field:'config_id', title: '序', width:120, sort: true, fixed: true}
				  ,{field:'config_Code', title: '页面编号', width:140}
				  ,{field:'config_name', title: '页面名称', width:200}
				  ,{field:'config_herf', title: '页面链接', minWidth:220}
				  ,{field:'config_sort', title: '排序', width:120}
				  ,{field:'config_founder', title: '创建人', width:160}
				  ,{field:'config_creat', title: '创建时间', width:160}
				  ,{field:'config_renew', title: '更新人', width:160}
				  ,{field:'config_update', title: '更新时间', width:160}
				  ,{field:'config_opera', title: '操作', width:200, toolbar:'#config_opera'}
				]]
				,page: true
			  });
			  //监听行工具事件
                table.on('tool(config_image)', function(obj){
                    var data = obj.data;
                    var id=data.id;
                    if(obj.event === 'config_img_field'){
                        element.tabChange('tab1', '2');
                    }
                });
			  
			  table.render({
				elem: '#config_image_field',
				url: '../datajson/configfield.json',
				toolbar:'#b_config_field',
				cols: [[
				  {checkbox: true, fixed: true}
				  ,{field:'config_field_id', title: '页面编号', width:100, sort: true, fixed: true}
				  ,{field:'config_field_dname', title: '数据表字段名称', width:220, edit: 'text'}
				  ,{field:'config_field_dtype', title: '数据表字段类型', width:160, edit: 'text'}
				  ,{field:'config_field_cname', title: '页面显示名称', width:220, edit: 'text'}
				  ,{field:'config_field_ctype', title: '页面显示类型', width:160, edit: 'text'}
				  ,{field:'config_field_cdisplay', title: '是否显示', width:120, edit: 'text'}
				  ,{field:'config_field_value', title: '默认值', width:120, edit: 'text'}
				  ,{field:'config_field_ccondition', title: '是否为查询条件', width:140, edit: 'text'}
				  ,{field:'config_field_chigh', title: '查询主次', width:120, edit: 'text'}
				  ,{field:'config_field_describe', title: '描述', edit: 'text', minWidth:220}
				  ,{field:'config_field_sort', title: '排序', width:120}
				  ,{field:'config_field_attribute', title: '操作', width:120, toolbar:'#config_attribute', fixed:'right'}
				]]
				,page: true
			  });
			  table.on('tool(config_image_field)', function(obj){
				  var data = obj.data;
				  var id =data.id;
                    if(obj.event === 'config_attribute'){
                        layer.open ({
							type:1
						  ,title:'属性配置'
						  ,btn:'提交'
						  ,content:$('#attribute_cont').html()
						});
                    }
					form.render();   //弹出层是复制组件，需要手动执行form.render
			  });
			  
			  table.render({
				elem: '#config_image_file',
				url: '../datajson/configimgfile.json',
				toolbar:'#b_config_image',
				cols: [[
				  {checkbox: true, fixed: true}
				  ,{field:'config_file_tcode', title: '业务编码', width:140, sort: true, fixed: true}
				  ,{field:'config_file_tname', title: '业务名称', width:160}
				  ,{field:'config_file_code', title: '影像文件种类编码', width:180}
				  ,{field:'config_file_name', title: '影像文件种类名称', width:180}
				  ,{field:'config_file_invoice', title: '发票标识', width:140}
				  ,{field:'config_file_truth', title: '平台验真标识', width:140}
				  ,{field:'config_file_dedu', title: '可抵扣标识', width:140}
				  ,{field:'config_file_auth', title: '可认证标识', width:140}
				  ,{field:'config_file_invtype', title: '发票种类', width:160}
				  ,{field:'config_file_rule', title: '规则校验标识', width:160}
				  ,{field:'config_file_rulemode', title: '规则校验方式', width:160}
				  ,{field:'config_file_ruleconfig', title: '规则校验配置码', width:160}
				  ,{field:'config_file_cover', title: '封面标识', width:140}
				  ,{field:'config_file_disting', title: '识别标识', width:140}
				  ,{field:'config_file_dismode', title: '识别方式', width:140}
				  ,{field:'config_file_position', title: '识别位置', width:140}
				  ,{field:'config_file_covregular', title: '封面条码正则表达式', width:240}
				  ,{field:'config_file_codelen', title: '封面条码最大长度', width:160}
				  ,{field:'config_file_covcode', title: '页面编码', width:160}
				  ,{field:'config_file_dataiden', title: '数据标识', width:140}
				  ,{field:'config_file_datatable', title: '数据主表', width:180}
				  ,{field:'config_file_datadetail', title: '数据明细表标识', width:160}
				  ,{field:'config_file_detailtable', title: '数据明细表', width:160}
				  ,{field:'config_file_task', title: '任务标识', width:160}
				  ,{field:'config_file_taskfit', title: '任务适配方式', width:160}
				  ,{field:'config_opera', title: '操作', width:160, toolbar:'#config_opera',fixed:'right'}
				]]
				,page: true
			  });
			  //监听行工具事件
                table.on('tool(config_image_file)', function(obj){
                    var data = obj.data;
                    var id=data.id;
                    if(obj.event === 'config_img_field'){
                        element.tabChange('tab1', '2');
                    }
                });
			  
			  table.render({
				elem: '#config_file_field',
				url: '../datajson/configffield.json',
				toolbar:'#b_config_image',
				cols: [[
				  {checkbox: true, fixed: true}
				  ,{field:'config_field_id', title: '文件种类ID', width:140, sort: true, fixed: true}
				  ,{field:'config_field_dname', title: '数据表字段名称', width:220, edit: 'text'}
				  ,{field:'config_field_dtype', title: '数据表字段类型', width:160, edit: 'text'}
				  ,{field:'config_field_cname', title: '页面显示名称', width:220, edit: 'text'}
				  ,{field:'config_field_ctype', title: '页面显示类型', width:160, edit: 'text'}
				  ,{field:'config_field_cdisplay', title: '页面是否显示', width:120}
				  ,{field:'config_field_value', title: '默认值', width:120, edit: 'text'}
				  ,{field:'config_field_ccondition', title: '是否为查询条件', width:140}
				  ,{field:'config_field_chigh', title: '查询主次', width:120}
				  ,{field:'config_field_describe', title: '描述', edit: 'text'}
				  ,{field:'config_field_sort', title: '排序', width:120}
				]]
				,page: true
			  });
			  table.on('toolbar(config_file_field)', function(obj){
				  var data = obj.data;
                    if(obj.event === 'att_submit'){
                        layer.open ({
						  type:1
						  ,area: ['700px', '554px']
						  ,title:'属性配置'
						  ,btn:'提交'
						  ,content:$('#attribute_cont').html()
						});
                    }
					form.render();   //弹出层是复制组件，需要手动执行form.render
			  });
			  
			  table.render({
				elem: '#config_file_hfield',
				url: '../datajson/confighfield.json',
				toolbar:'#b_config_image',
				cols: [[
				  {checkbox: true, fixed: true}
				  ,{field:'config_field_id', title: '文件种类ID', width:140, sort: true, fixed: true}
				  ,{field:'config_field_dname', title: '数据表字段名称', width:220, edit: 'text'}
				  ,{field:'config_field_dtype', title: '数据表字段类型', width:160, edit: 'text'}
				  ,{field:'config_field_cname', title: '页面显示名称', width:220, edit: 'text'}
				  ,{field:'config_field_ctype', title: '页面显示类型', width:160, edit: 'text'}
				  ,{field:'config_field_cdisplay', title: '页面是否显示', width:120}
				  ,{field:'config_field_value', title: '默认值', width:120, edit: 'text'}
				  ,{field:'config_field_ccondition', title: '是否为查询条件', width:140}
				  ,{field:'config_field_chigh', title: '查询主次', width:120}
				  ,{field:'config_field_describe', title: '描述', edit: 'text'}
				  ,{field:'config_field_sort', title: '排序', width:120}
				]]
				,page: true
			  });
			  table.on('toolbar(config_file_hfield)', function(obj){
				  var data = obj.data;
                    if(obj.event === 'att_submit'){
                        layer.open ({
							type:1
							,area: ['700px', '554px']
						  ,title:'属性配置'
						  ,btn:'提交'
						  ,content:$('#attribute_cont').html()
						});
                    }
					form.render();   //弹出层是复制组件，需要手动执行form.render
			  });
			  
			  table.render({
				elem: '#config_type',
				url: '../datajson/configtype.json',
				toolbar:'#b_config_type',
				cols: [[
				  {checkbox: true, fixed: true}
				  ,{field:'config_type_id', title: '业务编号', width:160, sort: true, fixed: true}
				  ,{field:'config_type_dname', title: '业务名称', minWidth:220, edit: 'text'}
				  ,{field:'config_type_dtype', title: '创建人', width:160, edit: 'text'}
				  ,{field:'config_type_cname', title: '创建时间', minWidth:220, edit: 'text'}
				  ,{field:'config_type_ctype', title: '更新人', width:160, edit: 'text'}
				  ,{field:'config_type_cdisplay', title: '更新时间', minWidth:220, edit: 'text'}
				]]
				,page: true
			  });
			  
			  var $ = layui.$, active = {
				reload: function(){
				  var demoReload = $('#demoReload');
				  
				  //执行重载
				  table.reload('testReload', {
					page: {
					  curr: 1 //重新从第 1 页开始
					}
					,where: {
					  key: {
						id: demoReload.val()
					  }
					}
				  });
				}
			  };
			
			  
			  $('.demoTable .layui-btn').on('click', function(){
				var type = $(this).data('type');
				active[type] ? active[type].call(this) : '';
			  });
			   //日期
			  laydate.render({
				elem: '#a_mentiont'
				,range:true
			  });
			  laydate.render({
				elem: '#date2'
			  });
			  laydate.render({
				elem: '#invDate'
			  });
			  laydate.render({
				elem: '#taxtime'
				,type: 'month'
				,value:'2018-09'
				,isInitValue: true
			  });
			  laydate.render({
				elem: '#taxswitch'
				,type: 'month'
				,value:'2018-09'
				,isInitValue: true
				,min: '2018-09'
				,max: '2018-10'
			  });
			  
			var urlMap={
			      getDetialUrl:"../datajson/getTaskDetia.json"
              }
			  
			  function getDtails(id) {
                  $.ajax({
                      url: urlMap.getDetialUrl,
                      type:'POST',
                      data:{
                          id : id
                      },
                      success:function(data){
                      
                      }
                  });

              }
              function getTaskList(id){
                  table.render({
                      elem: '#image_task',
                      url: '../datajson/taskcon.json',
					  toolbar: '#tool_image_task',
                      where:{
                          id : id
                      },
                      cols: [[
						  {checkbox: true, fixed: true}
						  ,{field:'b_id', title: '序号', width:140, sort: true, fixed: true}
						  ,{field:'b_username', title: '影像类型'}
						  ,{field:'b_seque', title: '影像格式', width:140}
						  ,{field:'b_cmode', title: '采集方式'}
						  ,{field:'b_ccode', title: '采集编号'}
						  ,{field:'b_collector', title: '采集人', width:140}
						  ,{field:'b_ctime', title: '采集时间'}
						]]
                      ,id: 'image_task'
                      ,page: true
                      
                  });
              }

			
			});
			
		$("#imgshow_hide").click(function(e) {
				$(".imgshow_hide").toggle();
			});

			
			