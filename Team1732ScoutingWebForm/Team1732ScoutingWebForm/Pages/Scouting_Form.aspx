<%@ Page Title="Home Page" Language="C#" MasterPageFile="~/Site.master" AutoEventWireup="true"
    CodeBehind="Scouting_Form.aspx.cs" Inherits="Team1732ScoutingWebForm._Default" %>

<asp:Content ID="HeaderContent" runat="server" ContentPlaceHolderID="HeadContent">
</asp:Content>
<asp:Content ID="BodyContent" runat="server" ContentPlaceHolderID="MainContent">
    <h2>
        Team 1732 Scouting Web Form
    </h2>
    <p>Team: <asp:TextBox ID="tbTeamNumber" runat="server" Height="16px" Width="214px"></asp:TextBox></p>
    <p>Alliance: 
        <asp:DropDownList ID="dllAlliance" runat="server">
            <asp:ListItem>Blue</asp:ListItem>
            <asp:ListItem>Red</asp:ListItem>
        </asp:DropDownList>
    </p>
    <p>
        
    </p>
</asp:Content>
