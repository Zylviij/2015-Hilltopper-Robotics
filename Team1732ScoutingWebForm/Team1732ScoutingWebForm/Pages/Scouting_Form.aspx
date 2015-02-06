<%@ Page Title="Home Page" Language="C#" MasterPageFile="~/Site.master" AutoEventWireup="true"
    CodeBehind="Scouting_Form.aspx.cs" Inherits="Team1732ScoutingWebForm._Default" %>

<asp:Content ID="HeaderContent" runat="server" ContentPlaceHolderID="HeadContent">
</asp:Content>
<asp:Content ID="BodyContent" runat="server" ContentPlaceHolderID="MainContent">
    <h2>
        Team 1732 Scouting Web Form
    </h2>
    <p>
        Team:
        <asp:TextBox ID="tbTeamNumber" runat="server" Height="16px" Width="214px"></asp:TextBox>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
        KEY:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; N/A = Not Applicable&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
        N.E.I. = Not Enough Information&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; HP = 
        Human Player&nbsp; </p>
    <p>
        Alliance:
        <asp:DropDownList ID="dllAlliance" runat="server">
            <asp:ListItem>Blue</asp:ListItem>
            <asp:ListItem>Red</asp:ListItem>
        </asp:DropDownList>
    </p>
    <p>
        What did they do during Autonomous?
        <asp:DropDownList ID="dllAutoSelect" runat="server" 
            onselectedindexchanged="dllAutoSelect_SelectedIndexChanged">
            <asp:ListItem>No Autonomous</asp:ListItem>
            <asp:ListItem>Stack&#39;d Totes</asp:ListItem>
            <asp:ListItem>Grabs Bins</asp:ListItem>
            <asp:ListItem>Removes Bins from step</asp:ListItem>
            <asp:ListItem>Drives Forward</asp:ListItem>
            <asp:ListItem>Collected Gray Totes</asp:ListItem>
            <asp:ListItem>Got Stuck</asp:ListItem>
            <asp:ListItem>Other</asp:ListItem>
        </asp:DropDownList>
    </p>
    <p>
        Do they pick up totes from the HP or the Landfill Zone?<asp:CheckBoxList 
            ID="CheckBoxList3" runat="server" style="margin-right: 46px">
            <asp:ListItem>Human Player</asp:ListItem>
            <asp:ListItem>Landfill Zone</asp:ListItem>
        </asp:CheckBoxList>
    </p>
    <p>
        Can they pick up totes?<asp:RadioButtonList ID="RadioButtonList1" 
            runat="server">
            <asp:ListItem>Yes</asp:ListItem>
            <asp:ListItem>NO</asp:ListItem>
            <asp:ListItem>N.E.I.</asp:ListItem>
        </asp:RadioButtonList>
    </p>
    <p>
        How many totes can they hold ?<asp:DropDownList ID="DropDownList1" 
            runat="server">
            <asp:ListItem>1</asp:ListItem>
            <asp:ListItem>2</asp:ListItem>
            <asp:ListItem>3</asp:ListItem>
            <asp:ListItem>4</asp:ListItem>
            <asp:ListItem>5</asp:ListItem>
            <asp:ListItem>6</asp:ListItem>
        </asp:DropDownList>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; And do they hold the totes on the interior or 
        exterior of the robot?<asp:DropDownList ID="DropDownList2" runat="server">
            <asp:ListItem>Interior</asp:ListItem>
            <asp:ListItem>Exterior</asp:ListItem>
        </asp:DropDownList>
    </p>
    <p>
        Can they pick up bins?<asp:RadioButtonList ID="RadioButtonList2" runat="server" 
            Height="16px">
            <asp:ListItem>Yes</asp:ListItem>
            <asp:ListItem>NO</asp:ListItem>
            <asp:ListItem>N.E.I.</asp:ListItem>
        </asp:RadioButtonList>
&nbsp; And can they stack them?
        <asp:RadioButtonList ID="RadioButtonList3" runat="server" Height="16px">
            <asp:ListItem>Yes</asp:ListItem>
            <asp:ListItem>NO</asp:ListItem>
            <asp:ListItem>N.E.I.</asp:ListItem>
        </asp:RadioButtonList>
    </p>
    <p>
        How good is their maneuvering?
        <asp:DropDownList ID="DropDownList3" runat="server">
            <asp:ListItem>Poor</asp:ListItem>
            <asp:ListItem>Okay</asp:ListItem>
            <asp:ListItem>Average</asp:ListItem>
            <asp:ListItem>Good</asp:ListItem>
            <asp:ListItem>Very Good</asp:ListItem>
        </asp:DropDownList>
&nbsp;</p>
    <p>
        Did the robot meander (wander aimlessly?)
        <asp:RadioButtonList ID="RadioButtonList4" runat="server" Height="16px">
            <asp:ListItem>Yes</asp:ListItem>
            <asp:ListItem>NO</asp:ListItem>
            <asp:ListItem>N.E.I.</asp:ListItem>
        </asp:RadioButtonList>
    </p>
    <p>
        What kind of Coopertition do they attempt/complete?
        <asp:DropDownList ID="DropDownList4" runat="server">
            <asp:ListItem>Coopertition Stack</asp:ListItem>
            <asp:ListItem>Coopertition Set</asp:ListItem>
            <asp:ListItem>Did not attempt</asp:ListItem>
        </asp:DropDownList>
&nbsp;
    </p>
    <p>
    &nbsp;&nbsp; Were they able to complete it?
        <asp:RadioButtonList ID="RadioButtonList6" runat="server">
            <asp:ListItem>Yes</asp:ListItem>
            <asp:ListItem>No</asp:ListItem>
            <asp:ListItem>N/A</asp:ListItem>
        </asp:RadioButtonList>
    </p>
    <p>
        Can they insert pool noodles in the bin?
        <asp:RadioButtonList ID="RadioButtonList7" runat="server" Height="16px">
            <asp:ListItem>Yes</asp:ListItem>
            <asp:ListItem>NO</asp:ListItem>
            <asp:ListItem>N.E.I.</asp:ListItem>
        </asp:RadioButtonList>
&nbsp;&nbsp; Was the robot impeded by stray pool noodles?<asp:RadioButton 
            ID="RadioButton26" runat="server" Text="Yes" />
        <asp:RadioButton ID="RadioButton27" runat="server" Text="No" />
    </p>
    <p>
        How good is HP (Human Player)??<asp:DropDownList ID="DropDownList5" 
            runat="server">
            <asp:ListItem>Pretty Bad</asp:ListItem>
            <asp:ListItem>Meh</asp:ListItem>
            <asp:ListItem>Eh, alright</asp:ListItem>
            <asp:ListItem>I could work with this</asp:ListItem>
            <asp:ListItem>Yeah he&#39;s alright</asp:ListItem>
            <asp:ListItem>Considerable</asp:ListItem>
            <asp:ListItem>Aw yissss</asp:ListItem>
        </asp:DropDownList>
    </p>
    <p>
        Do they have more speed or torque?
        <asp:DropDownList ID="DropDownList6" runat="server">
            <asp:ListItem>Speed</asp:ListItem>
            <asp:ListItem>Torque</asp:ListItem>
            <asp:ListItem>Not noticeable</asp:ListItem>
        </asp:DropDownList>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; How good is their grip on the object they&#39;re holding?<asp:CheckBoxList 
            ID="CheckBoxList2" runat="server">
            <asp:ListItem>Tote slips</asp:ListItem>
            <asp:ListItem>Bin slips</asp:ListItem>
            <asp:ListItem>Pretty Secure</asp:ListItem>
            <asp:ListItem>N.E.I.</asp:ListItem>
            <asp:ListItem>Not good at maneuvering while holding the bin/tote</asp:ListItem>
        </asp:CheckBoxList>
    </p>
    <p>
        Is the robot easily damaged?
        <asp:RadioButton ID="RadioButton28" runat="server" Text="Yasssss" />
        <asp:RadioButton ID="RadioButton29" runat="server" Text="Nah" />
    </p>
</asp:Content>
