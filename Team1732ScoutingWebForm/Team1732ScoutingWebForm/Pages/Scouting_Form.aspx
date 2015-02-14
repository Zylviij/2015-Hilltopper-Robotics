<%@ Page Title="Home Page" Language="C#" MasterPageFile="~/Site.master" AutoEventWireup="true"
    CodeBehind="Scouting_Form.aspx.cs" Inherits="Team1732ScoutingWebForm._Default" %>

<asp:Content ID="HeaderContent" runat="server" ContentPlaceHolderID="HeadContent">
</asp:Content>
<asp:Content ID="BodyContent" runat="server" ContentPlaceHolderID="MainContent">
    <h2>
        Team 1732 Scouting Web Form
    </h2>
    <div id="Team_Info" align="Center">
        <asp:Table ID="Table1" runat="server" Height="50px" Width="100%" 
            Font-Size="Large">
            <asp:TableRow>
                <asp:TableCell>
                    <asp:Label ID="Label1" runat="server" Text="Team # "></asp:Label><asp:TextBox ID="TextBox1"
                        runat="server" ForeColor="#FF0066"></asp:TextBox></asp:TableCell>
                <asp:TableCell>
                    <asp:Label ID="Label2" runat="server" Text="Match # "></asp:Label><asp:TextBox ID="TextBox2"
                        runat="server" ForeColor="#FF0066"></asp:TextBox></asp:TableCell>
            </asp:TableRow>
        </asp:Table>
    </div>
    <br />
    <div id="Autonomous">     
        <asp:Table ID="autonomousBlock" runat="server" Width="100%">
            <asp:TableRow Height="25px">
                <asp:TableCell HorizontalAlign="Center">
                    <asp:Label ID="Label3" runat="server" Text="Autonomous" Font-Bold Font-Size=Large></asp:Label>
                    <br />
                </asp:TableCell>
                <asp:TableCell HorizontalAlign="Center">
                    <asp:Label ID="Label5" runat="server" Text="Co-op" Font-Bold Font-Size=Large></asp:Label>
                    <br />
                </asp:TableCell>
            </asp:TableRow>
            <asp:TableRow>
                <asp:TableCell VerticalAlign="Middle" HorizontalAlign="Center">
                    <asp:Table ID="autonomousTable" runat="server" CellPadding="5" Font-Size="Large" GridLines="Both">
                        <asp:TableRow>
                            <asp:TableCell>&nbsp;</asp:TableCell>
                            <asp:TableCell>Yes</asp:TableCell>
                            <asp:TableCell>No</asp:TableCell>
                        </asp:TableRow>
                        <asp:TableRow>
                            <asp:TableCell>Tote-set</asp:TableCell>
                            <asp:TableCell>
                                <asp:RadioButton ID="toteSet_Yes" runat="server" /></asp:TableCell>
                            <asp:TableCell>
                                <asp:RadioButton ID="toteSet_No" runat="server" /></asp:TableCell>
                        </asp:TableRow>
                        <asp:TableRow>
                            <asp:TableCell>Tote-stack</asp:TableCell>
                            <asp:TableCell>
                                <asp:RadioButton ID="toteStack_Yes" runat="server" /></asp:TableCell>
                            <asp:TableCell>
                                <asp:RadioButton ID="toteStack_No" runat="server" /></asp:TableCell>
                        </asp:TableRow>
                        <asp:TableRow>
                            <asp:TableCell>Robot-set</asp:TableCell>
                            <asp:TableCell>
                                <asp:RadioButton ID="robotSet_Yes" runat="server" /></asp:TableCell>
                            <asp:TableCell>
                                <asp:RadioButton ID="robotSet_No" runat="server" /></asp:TableCell>
                        </asp:TableRow>
                        <asp:TableRow>
                            <asp:TableCell>Mobility</asp:TableCell>
                            <asp:TableCell>
                                <asp:RadioButton ID="mobility_Yes" runat="server" /></asp:TableCell>
                            <asp:TableCell>
                                <asp:RadioButton ID="mobility_No" runat="server" /></asp:TableCell>
                        </asp:TableRow>
                    </asp:Table>
                </asp:TableCell>
                <asp:TableCell VerticalAlign="Top">
                    <asp:Table ID="coopTable" runat="server" GridLines="Both" CellPadding="5" Font-Size="Large" HorizontalAlign="Center">
                        <asp:TableRow>
                            <asp:TableCell>&nbsp;</asp:TableCell>
                            <asp:TableCell>Stack</asp:TableCell>
                            <asp:TableCell>Set</asp:TableCell>
                        </asp:TableRow>
                        <asp:TableRow>
                            <asp:TableCell>Success</asp:TableCell>
                            <asp:TableCell><asp:RadioButton ID="RadioButton1" runat="server" /></asp:TableCell>
                            <asp:TableCell><asp:RadioButton ID="RadioButton2" runat="server" /></asp:TableCell>                   
                        </asp:TableRow>
                        <asp:TableRow>
                            <asp:TableCell>Attempted</asp:TableCell>
                            <asp:TableCell><asp:RadioButton ID="RadioButton3" runat="server" /></asp:TableCell>
                            <asp:TableCell><asp:RadioButton ID="RadioButton4" runat="server" /></asp:TableCell>                    
                        </asp:TableRow>
                    </asp:Table>        
                </asp:TableCell>
            </asp:TableRow>            
        </asp:Table>
        <br />
    </div>
    <div id="Teleop">
        &nbsp;&nbsp;
        <asp:Label ID="Label4" runat="server" Text="Teleop" Font-Bold Font-Size=Large></asp:Label>
        <br />
        <asp:Table ID="teleopTable" runat="server" CellPadding="5" 
            HorizontalAlign="Center">
        <asp:TableRow>
        <asp:TableCell Width="20%" VerticalAlign="Bottom">
        <asp:Image ID="Image1" runat="server" ImageUrl="~/Images/tote_bin_stack.jpg" 
            style="margin-bottom: 0px" />
        </asp:TableCell>
        <asp:TableCell Width="90%"  VerticalAlign="Bottom" HorizontalAlign="Center">
            <asp:Table ID="teleopTotes" runat="server" GridLines="Both" CellPadding="8" HorizontalAlign="Left">
            <asp:TableRow>
                <asp:TableCell HorizontalAlign="Center">&nbsp;</asp:TableCell>
                <asp:TableCell HorizontalAlign="Center"><asp:Label ID="Label6" runat="server" Text="Stack 1" Font-Bold></asp:Label></asp:TableCell>
                <asp:TableCell HorizontalAlign="Center"><asp:Label ID="Label7" runat="server" Text="Stack 2" Font-Bold></asp:Label> </asp:TableCell>
                <asp:TableCell HorizontalAlign="Center"><asp:Label ID="Label8" runat="server" Text="Stack 3" Font-Bold></asp:Label> </asp:TableCell>
                <asp:TableCell HorizontalAlign="Center"><asp:Label ID="Label9" runat="server" Text="Stack 4" Font-Bold></asp:Label> </asp:TableCell>
                <asp:TableCell HorizontalAlign="Center"><asp:Label ID="Label10" runat="server" Text="Stack 5" Font-Bold></asp:Label> </asp:TableCell>
                <asp:TableCell HorizontalAlign="Center"><asp:Label ID="Label11" runat="server" Text="Stack 6" Font-Bold></asp:Label> </asp:TableCell>
            </asp:TableRow>
            <asp:TableRow>            
                <asp:TableCell HorizontalAlign="Center"><asp:Label ID="Label12" runat="server" Text="Noood" Font-Bold></asp:Label></asp:TableCell>
                <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox7" runat="server"/></asp:TableCell>
                <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox8" runat="server"/></asp:TableCell>
                <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox9" runat="server"/></asp:TableCell>
                <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox10" runat="server"/></asp:TableCell>
                <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox11" runat="server"/></asp:TableCell>
                <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox12" runat="server"/></asp:TableCell>
            </asp:TableRow>
            <asp:TableRow>
                <asp:TableCell HorizontalAlign="Center" Height="80px"><asp:Label ID="Label13" runat="server" Text="Bin" Font-Bold></asp:Label></asp:TableCell>
                <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox13" runat="server"/></asp:TableCell>
                <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox14" runat="server"/></asp:TableCell>
                <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox15" runat="server"/></asp:TableCell>
                <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox16" runat="server"/></asp:TableCell>
                <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox17" runat="server"/></asp:TableCell>
                <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox18" runat="server"/></asp:TableCell>
            </asp:TableRow>
            <asp:TableRow>
                <asp:TableCell HorizontalAlign="Center"><asp:Label ID="Label14" runat="server" Text="TT6" Font-Bold></asp:Label></asp:TableCell>
                <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox19" runat="server"/></asp:TableCell>
                <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox20" runat="server"/></asp:TableCell>
                <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox21" runat="server"/></asp:TableCell>
                <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox22" runat="server"/></asp:TableCell>
                <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox23" runat="server"/></asp:TableCell>
                <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox24" runat="server"/></asp:TableCell>
            </asp:TableRow>
            <asp:TableRow>
                <asp:TableCell HorizontalAlign="Center"><asp:Label ID="Label15" runat="server" Text="TT5" Font-Bold></asp:Label></asp:TableCell>
                <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox25" runat="server"/></asp:TableCell>
                <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox26" runat="server"/></asp:TableCell>
                <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox27" runat="server"/></asp:TableCell>
                <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox28" runat="server"/></asp:TableCell>
                <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox29" runat="server"/></asp:TableCell>
                <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox30" runat="server"/></asp:TableCell>
            </asp:TableRow>
            <asp:TableRow>
                <asp:TableCell HorizontalAlign="Center"><asp:Label ID="Label16" runat="server" Text="TT4" Font-Bold></asp:Label></asp:TableCell>
                <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox31" runat="server"/></asp:TableCell>
                <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox32" runat="server"/></asp:TableCell>
                <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox33" runat="server"/></asp:TableCell>
                <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox34" runat="server"/></asp:TableCell>
                <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox35" runat="server"/></asp:TableCell>
                <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox36" runat="server"/></asp:TableCell>
            </asp:TableRow>
            <asp:TableRow>
                <asp:TableCell HorizontalAlign="Center"><asp:Label ID="Label17" runat="server" Text="TT3" Font-Bold></asp:Label></asp:TableCell>
                <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox37" runat="server"/></asp:TableCell>
                <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox38" runat="server"/></asp:TableCell>
                <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox39" runat="server"/></asp:TableCell>
                <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox40" runat="server"/></asp:TableCell>
                <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox41" runat="server"/></asp:TableCell>
                <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox42" runat="server"/></asp:TableCell>
            </asp:TableRow>
            <asp:TableRow>
                <asp:TableCell HorizontalAlign="Center"><asp:Label ID="Label18" runat="server" Text="TT2" Font-Bold></asp:Label></asp:TableCell>
                <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox43" runat="server"/></asp:TableCell>
                <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox44" runat="server"/></asp:TableCell>
                <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox45" runat="server"/></asp:TableCell>
                <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox46" runat="server"/></asp:TableCell>
                <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox47" runat="server"/></asp:TableCell>
                <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox48" runat="server"/></asp:TableCell>
            </asp:TableRow>
            <asp:TableRow>
                <asp:TableCell HorizontalAlign="Center"><asp:Label ID="Label19" runat="server" Text="TT1" Font-Bold></asp:Label></asp:TableCell>
                <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox49" runat="server"/></asp:TableCell>
                <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox50" runat="server"/></asp:TableCell>
                <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox51" runat="server"/></asp:TableCell>
                <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox52" runat="server"/></asp:TableCell>
                <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox53" runat="server"/></asp:TableCell>
                <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox54" runat="server"/></asp:TableCell>
            </asp:TableRow>
            </asp:Table>
        </asp:TableCell>

        </asp:TableRow>
        </asp:Table>
        <br />
    </div>
    <div id="moreToteStacks">
        <asp:CheckBox ID="enableMoarStacks" runat="server" 
            oncheckedchanged="enableMoarStacks_CheckedChanged" Text="Enable Moar Stacks" />
            <div id="moreToteStacksTable">
            <asp:Table ID="toteStacksSixPlus" runat="server" CellPadding="5" 
                HorizontalAlign="Center" Visible="False">
            <asp:TableRow>
            <asp:TableCell Width="90%"  VerticalAlign="Bottom" HorizontalAlign="Center">
                <asp:Table ID="Table3" runat="server" GridLines="Both" CellPadding="8" HorizontalAlign="Left">
                <asp:TableRow>
                    <asp:TableCell HorizontalAlign="Center">&nbsp;</asp:TableCell>
                    <asp:TableCell HorizontalAlign="Center"><asp:Label ID="Label20" runat="server" Text="Stack 7" Font-Bold></asp:Label></asp:TableCell>
                    <asp:TableCell HorizontalAlign="Center"><asp:Label ID="Label21" runat="server" Text="Stack 8" Font-Bold></asp:Label> </asp:TableCell>
                    <asp:TableCell HorizontalAlign="Center"><asp:Label ID="Label22" runat="server" Text="Stack 9" Font-Bold></asp:Label> </asp:TableCell>
                    <asp:TableCell HorizontalAlign="Center"><asp:Label ID="Label23" runat="server" Text="Stack 10" Font-Bold></asp:Label> </asp:TableCell>
                    <asp:TableCell HorizontalAlign="Center"><asp:Label ID="Label24" runat="server" Text="Stack 11" Font-Bold></asp:Label> </asp:TableCell>
                    <asp:TableCell HorizontalAlign="Center"><asp:Label ID="Label25" runat="server" Text="Stack 12" Font-Bold></asp:Label> </asp:TableCell>
                </asp:TableRow>
                <asp:TableRow>            
                    <asp:TableCell HorizontalAlign="Center"><asp:Label ID="Label26" runat="server" Text="Noood" Font-Bold></asp:Label></asp:TableCell>
                    <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox55" runat="server"/></asp:TableCell>
                    <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox56" runat="server"/></asp:TableCell>
                    <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox57" runat="server"/></asp:TableCell>
                    <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox58" runat="server"/></asp:TableCell>
                    <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox59" runat="server"/></asp:TableCell>
                    <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox60" runat="server"/></asp:TableCell>
                </asp:TableRow>
                <asp:TableRow>
                    <asp:TableCell HorizontalAlign="Center" Height="80px"><asp:Label ID="Label27" runat="server" Text="Bin" Font-Bold></asp:Label></asp:TableCell>
                    <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox61" runat="server"/></asp:TableCell>
                    <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox62" runat="server"/></asp:TableCell>
                    <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox63" runat="server"/></asp:TableCell>
                    <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox64" runat="server"/></asp:TableCell>
                    <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox65" runat="server"/></asp:TableCell>
                    <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox66" runat="server"/></asp:TableCell>
                </asp:TableRow>
                <asp:TableRow>
                    <asp:TableCell HorizontalAlign="Center"><asp:Label ID="Label28" runat="server" Text="TT6" Font-Bold></asp:Label></asp:TableCell>
                    <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox67" runat="server"/></asp:TableCell>
                    <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox68" runat="server"/></asp:TableCell>
                    <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox69" runat="server"/></asp:TableCell>
                    <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox70" runat="server"/></asp:TableCell>
                    <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox71" runat="server"/></asp:TableCell>
                    <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox72" runat="server"/></asp:TableCell>
                </asp:TableRow>
                <asp:TableRow>
                    <asp:TableCell HorizontalAlign="Center"><asp:Label ID="Label29" runat="server" Text="TT5" Font-Bold></asp:Label></asp:TableCell>
                    <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox73" runat="server"/></asp:TableCell>
                    <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox74" runat="server"/></asp:TableCell>
                    <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox75" runat="server"/></asp:TableCell>
                    <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox76" runat="server"/></asp:TableCell>
                    <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox77" runat="server"/></asp:TableCell>
                    <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox78" runat="server"/></asp:TableCell>
                </asp:TableRow>
                <asp:TableRow>
                    <asp:TableCell HorizontalAlign="Center"><asp:Label ID="Label30" runat="server" Text="TT4" Font-Bold></asp:Label></asp:TableCell>
                    <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox79" runat="server"/></asp:TableCell>
                    <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox80" runat="server"/></asp:TableCell>
                    <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox81" runat="server"/></asp:TableCell>
                    <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox82" runat="server"/></asp:TableCell>
                    <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox83" runat="server"/></asp:TableCell>
                    <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox84" runat="server"/></asp:TableCell>
                </asp:TableRow>
                <asp:TableRow>
                    <asp:TableCell HorizontalAlign="Center"><asp:Label ID="Label31" runat="server" Text="TT3" Font-Bold></asp:Label></asp:TableCell>
                    <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox85" runat="server"/></asp:TableCell>
                    <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox86" runat="server"/></asp:TableCell>
                    <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox87" runat="server"/></asp:TableCell>
                    <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox88" runat="server"/></asp:TableCell>
                    <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox89" runat="server"/></asp:TableCell>
                    <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox90" runat="server"/></asp:TableCell>
                </asp:TableRow>
                <asp:TableRow>
                    <asp:TableCell HorizontalAlign="Center"><asp:Label ID="Label32" runat="server" Text="TT2" Font-Bold></asp:Label></asp:TableCell>
                    <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox91" runat="server"/></asp:TableCell>
                    <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox92" runat="server"/></asp:TableCell>
                    <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox93" runat="server"/></asp:TableCell>
                    <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox94" runat="server"/></asp:TableCell>
                    <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox95" runat="server"/></asp:TableCell>
                    <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox96" runat="server"/></asp:TableCell>
                </asp:TableRow>
                <asp:TableRow>
                    <asp:TableCell HorizontalAlign="Center"><asp:Label ID="Label33" runat="server" Text="TT1" Font-Bold></asp:Label></asp:TableCell>
                    <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox97" runat="server"/></asp:TableCell>
                    <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox98" runat="server"/></asp:TableCell>
                    <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox99" runat="server"/></asp:TableCell>
                    <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox100" runat="server"/></asp:TableCell>
                    <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox101" runat="server"/></asp:TableCell>
                    <asp:TableCell HorizontalAlign="Center"><asp:CheckBox ID="CheckBox102" runat="server"/></asp:TableCell>
                </asp:TableRow>
                </asp:Table>
            </asp:TableCell>

            </asp:TableRow>
            </asp:Table>
        </div>
    </div>
</asp:Content>
