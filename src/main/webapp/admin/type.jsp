<%@page pageEncoding="utf-8" contentType="text/html; utf-8"  language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>区域管理</title>
    <link rel="stylesheet" type="text/css" href="easyUI/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="easyUI/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="easyUI/css/demo.css">
    <script src="js/jquery-1.8.3.js" language="JavaScript" type="text/javascript"></script>
    <!--jquery.easyui.min.js包含了easyUI中的所有插件-->
    <script src="js/jquery.easyui.min.js" language="JavaScript" type="text/javascript"></script>
    <script language="JavaScript" type="text/javascript" src="js/type.js"></script>
</head>
<body>
   <!--显示区域的表格-->
    <table id="dg"></table>

   <!--工具栏-->
   <div id="ToolBar">
       <div style="height: 40px;">
           <a href="javascript:goAdd()" class="easyui-linkbutton"
              iconCls="icon-add" plain="true">添加</a>
           <a
                   href="javascript:goUpdate()" class="easyui-linkbutton"
                   iconCls="icon-edit" plain="true">修改</a>
           <a
                   href="javascript:deleteMoreDirstrict()" class="easyui-linkbutton"
                   iconCls="icon-remove" plain="true">批量删除</a>
       </div>
   </div>

    <!--添加窗口-->
   <div id="AddDialog" class="easyui-dialog" buttons="#AddDialogButtons"
        style="width: 280px; height: 250px; padding: 10px 20px;" closed="true"  modal="true">
       <form id="addDialogForm"  method="post">
           <table>
               <tr>
                   <td>区域名称:</td>
                   <td><input type="text" class="easyui-validatebox" required
                              name="name" id="bname" /></td>
                </tr>
           </table>
       </form>
   </div>
    <!--添加窗口的按钮-->
   <div id="AddDialogButtons">
       <a href="javascript:SaveDialog()" class="easyui-linkbutton"
          iconCls="icon-ok">保存</a> <a href="javascript:CloseDialog('AddDialog')"
                                      class="easyui-linkbutton" iconCls="icon-cancel">取消</a>
   </div>



   <!--修改窗口-->
   <div id="upDialog" class="easyui-dialog" buttons="#upDialogButtons"
        style="width: 280px; height: 250px; padding: 10px 20px;" closed="true"  modal="true">
       <form id="upDialogForm"  method="post">
           <table>
               <input type="hidden" name="id">
               <tr>
                   <td>区域名称:</td>
                   <td><input type="text" class="easyui-validatebox" required
                              name="name" id="bname" /></td>
               </tr>
           </table>
       </form>
   </div>
   <!--添加修改的按钮-->
   <div id="upDialogButtons">
       <a href="javascript:updateSaveDialog()" class="easyui-linkbutton"
          iconCls="icon-ok">更新</a> <a href="javascript:CloseDialog('upDialog')"
                                      class="easyui-linkbutton" iconCls="icon-cancel">取消</a>
   </div>
</body>
</html>